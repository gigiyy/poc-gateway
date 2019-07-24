# Spring Cloud Gateway receipt

## summary

* `Spring Cloud Gateway` is using `Netty` as its container, other containers are not supported yet.
if there are other containers in the classpath, application might failed to start.

* reactive web technology of `WebFlux` is used instead `WebMvc`, 
it's necessary to make sure to exclude it to avoid issues. 

## simple gateway route setup

```java
@RestController
@Slf4j
public class PalGatewayController {

    @Value("${pal.url}")
    String palUrl;
    @Bean
    public RouteLocator palGateway(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/api/accounts")
                        .filters(f -> f.rewritePath("/api/accounts", "/accounts"))
                        .uri(palUrl))
                .build();
    }
}
```

or use `application.yml` instead:

```yaml
  cloud:
    gateway:
      routes:
      - id: account
        uri: lb://account-server
        predicates:
          - Path=/api/accounts
        filters:
          - RewritePath=/api/accounts, /accounts
```

## dependencies

Notes: 
* for test, `wiremock-standalone` should be used. otherwise the `jetty` dependencies of `wiremock` will be conflicting with `netty`.
* there are examples where `cloud conract stub runner` is used to bring in `wiremock` dependencies, 
however it'll bring in `jetty` dependencies too.
```groovy
    implementation 'org.springframework.cloud:spring-cloud-starter-gateway'
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    
    testCompile "com.github.tomakehurst:wiremock-standalone:2.23.2"
```

## test code

Notes:
* `webEnvironment` setting is necessary, otherwise the gateway's web server won't be started.
* `@AutoConfigureWebTestClient` can't properly setup `webTestClient`, do it manually instead.

```java
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PalGatewayControllerTest {

    @Rule
    public WireMockRule rule = new WireMockRule(8089);

    WebTestClient webTestClient;

    @Before
    public void setUp() {

        String baseUri = "http://localhost:" + 8080;
        this.webTestClient = WebTestClient.bindToServer()
                .responseTimeout(Duration.ofSeconds(10)).baseUrl(baseUri).build();

        stubFor(get(urlPathEqualTo("/accounts"))
                .withQueryParam("name", matching("guixin"))
                .willReturn(aResponse().withStatus(200).withBody(
                        "{ \"result\": \"account\" }"
                ))
        );
    }

    @Test
    public void sendAssertionsToTargetServer() {
        webTestClient.get().uri(builder -> builder.path("/api/accounts").queryParam("name", "guixin").build())
                .exchange().expectStatus().isOk().expectBody().jsonPath("$.result", "account");

    }
}
```


## add service discovery

### dependencies

`starter security` dependencies are needed for service discovery to function.
```groovy
    implementation "io.pivotal.spring.cloud:spring-cloud-services-starter-service-registry"
    implementation "org.springframework.boot:spring-boot-starter-security"
```

### add permit all security config

Notes: 
* `@EnableWebFluxSecurity` should be used instead of `@EnbableWebSecurity`.
* `csrf()` should be disabled together.

```java
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http.authorizeExchange().anyExchange().permitAll().and().csrf().disable().build();
    }

}
```

### set web application type

this is needed as `starter service registry` will bring in `WebMvc` dependencies.
without below config, application can't be started normally.
```yaml
spring:
  main:
    web-application-type: reactive
```

### exclude `EurekaInstanceAutoConfiguration`

for deploying the application to PCF, it's necessary to exclude the `EurekaInstanceAutoConfiguration.class`

```java
@SpringBootApplication(exclude = {EurekaInstanceAutoConfiguration.class})
public class PalGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalGatewayApplication.class, args);
    }

}
```

## version management

it's necessary to align the versions of SCS tile, client libraries, boot and spring cloud versions.
as details can be found in this page: [client dependencies](https://docs.pivotal.io/spring-cloud-services/2-0/common/client-dependencies.html#including-spring-cloud-services-dependencies).

to retrieve the SCS tile version running in PCF: 

```bash
curl https://spring-cloud-broker.${APPS_DOMAIN}/actuator/info
```

the value of `APPS_DOMAIN` can be found by `cf domains` command.

```groovy
dependencyManagement {
    imports {
        mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
        mavenBom "io.pivotal.spring.cloud:spring-cloud-services-dependencies:$springCloudServicesClientLibrariesVersion"
    }
}
```