## log

gateway serer can be deployed normally, however, it can't register itself to the service registry
and can't route the call to destination server too.
```log
Whitelabel Error Page
This application has no configured error view, so you are seeing this as a fallback.

Wed Jul 24 02:57:43 UTC 2019
There was an unexpected error (type=Service Unavailable, status=503).
Unable to find instance for account-server
```

```log
2019-07-24T01:49:27.544Z [API/2] [OUT] Created app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T01:49:34.470Z [API/8] [OUT] Uploading bits for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T01:49:42.956Z [API/7] [OUT] Creating build for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T01:49:43.879Z [API/7] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STARTED"})
2019-07-24T01:49:44.032Z [STG/0] [OUT] Downloading dotnet_core_buildpack_beta...
2019-07-24T01:49:44.032Z [STG/0] [OUT] Downloading dotnet_core_buildpack...
2019-07-24T01:49:44.033Z [STG/0] [OUT] Downloading nodejs_buildpack...
2019-07-24T01:49:44.033Z [STG/0] [OUT] Downloading php_buildpack...
2019-07-24T01:49:44.066Z [STG/0] [OUT] Downloading staticfile_buildpack...
2019-07-24T01:49:44.139Z [STG/0] [OUT] Downloaded staticfile_buildpack
2019-07-24T01:49:44.139Z [STG/0] [OUT] Downloading java_buildpack...
2019-07-24T01:49:44.195Z [STG/0] [OUT] Downloaded java_buildpack
2019-07-24T01:49:44.195Z [STG/0] [OUT] Downloading ruby_buildpack...
2019-07-24T01:49:44.239Z [STG/0] [OUT] Downloaded ruby_buildpack
2019-07-24T01:49:44.239Z [STG/0] [OUT] Downloading go_buildpack...
2019-07-24T01:49:46.663Z [STG/0] [OUT] Downloaded dotnet_core_buildpack_beta (99.4M)
2019-07-24T01:49:46.663Z [STG/0] [OUT] Downloading binary_buildpack...
2019-07-24T01:49:46.697Z [STG/0] [OUT] Downloaded binary_buildpack
2019-07-24T01:49:46.697Z [STG/0] [OUT] Downloading python_buildpack...
2019-07-24T01:49:52.403Z [STG/0] [OUT] Downloaded nodejs_buildpack (121.6M)
2019-07-24T01:51:30.215Z [STG/0] [OUT] Downloaded php_buildpack (520.7M)
2019-07-24T01:51:32.024Z [STG/0] [OUT] Downloaded python_buildpack (563.7M)
2019-07-24T01:51:35.004Z [STG/0] [OUT] Downloaded dotnet_core_buildpack (873.9M)
2019-07-24T01:51:36.613Z [STG/0] [OUT] Downloaded go_buildpack (657.3M)
2019-07-24T01:51:36.613Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 creating container for instance 84ab930b-1714-450d-8e58-292a8bbcf96b
2019-07-24T01:51:38.185Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 successfully created container for instance 84ab930b-1714-450d-8e58-292a8bbcf96b
2019-07-24T01:51:38.621Z [STG/0] [OUT] Downloading app package...
2019-07-24T01:51:41.669Z [STG/0] [OUT] Downloaded app package (40.2M)
2019-07-24T01:51:46.397Z [STG/0] [OUT] [1m[31m----->[0m[22m [1m[34mJava Buildpack[0m[22m [34mv4.20[0m [34m(offline)[0m | https://github.com/cloudfoundry/java-buildpack.git#2cd7e3e
2019-07-24T01:51:46.486Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mJvmkill Agent[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so [3m[32m(found in cache)[0m[23m
2019-07-24T01:51:46.495Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen Jdk JRE[0m[22m [34m1.8.0_222[0m from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/openjdk-jre-1.8.0_222-bionic.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T01:51:48.076Z [STG/0] [OUT] Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre [3m[32m(1.5s)[0m[23m
2019-07-24T01:51:48.076Z [STG/0] [OUT] JVM DNS caching disabled in lieu of BOSH DNS caching
2019-07-24T01:51:48.077Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen JDK Like Memory Calculator[0m[22m [34m3.13.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T01:51:49.924Z [STG/0] [OUT] Loaded Classes: 18985, Threads: 250
2019-07-24T01:51:49.968Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mClient Certificate Mapper[0m[22m [34m1.8.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.8.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T01:51:49.970Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mContainer Security Provider[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.16.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T01:51:49.972Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mSpring Auto Reconfiguration[0m[22m [34m2.7.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.7.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T01:52:08.221Z [STG/0] [OUT] Exit status 0
2019-07-24T01:52:08.221Z [STG/0] [OUT] Uploading droplet, build artifacts cache...
2019-07-24T01:52:08.221Z [STG/0] [OUT] Uploading droplet...
2019-07-24T01:52:08.221Z [STG/0] [OUT] Uploading build artifacts cache...
2019-07-24T01:52:08.361Z [STG/0] [OUT] Uploaded build artifacts cache (130B)
2019-07-24T01:52:09.829Z [API/4] [OUT] Creating droplet for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T01:52:13.112Z [STG/0] [OUT] Uploaded droplet (83.7M)
2019-07-24T01:52:13.142Z [STG/0] [OUT] Uploading complete
2019-07-24T01:52:13.505Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 stopping instance 84ab930b-1714-450d-8e58-292a8bbcf96b
2019-07-24T01:52:13.505Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 destroying container for instance 84ab930b-1714-450d-8e58-292a8bbcf96b
2019-07-24T01:52:13.885Z [CELL/0] [OUT] Cell a32a5e3a-75de-4118-9041-9e2be7c61855 creating container for instance b471c32a-c71a-4b20-61ee-9930
2019-07-24T01:52:14.248Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 successfully destroyed container for instance 84ab930b-1714-450d-8e58-292a8bbcf96b
2019-07-24T01:52:14.642Z [CELL/0] [OUT] Cell a32a5e3a-75de-4118-9041-9e2be7c61855 successfully created container for instance b471c32a-c71a-4b20-61ee-9930
2019-07-24T01:52:14.783Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T01:52:19.099Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T01:52:19.100Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T01:52:19.882Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T01:52:25.346Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:25.338 INFO 14 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T01:52:25.348Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:25.348 INFO 14 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T01:52:25.999Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:25.999 INFO 14 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b705fc0d] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T01:52:26.374Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T01:52:26.374Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T01:52:26.374Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T01:52:26.374Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T01:52:26.374Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T01:52:26.374Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T01:52:26.375Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T01:52:26.414Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:26.414 INFO 14 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T01:52:26.415Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:26.415 INFO 14 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T01:52:26.419Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:26.419 INFO 14 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T01:52:31.096Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:31.096 INFO 14 --- [ main] o.s.cloud.context.scope.GenericScope : BeanFactory id=36109046-3f05-36f1-b12f-6ab982b80942
2019-07-24T01:52:31.123Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:31.122 INFO 14 --- [ main] eReconfigurationBeanFactoryPostProcessor : Skipping reconfiguration because cloud services already configured
2019-07-24T01:52:32.182Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:32.182 INFO 14 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b705fc0d] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T01:52:36.826Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:36.824 INFO 14 --- [ main] ctiveUserDetailsServiceAutoConfiguration :
2019-07-24T01:52:36.826Z [APP/PROC/WEB/0] [OUT] Using generated security password: 08d7e7d5-f86e-4265-9dea-2f87dd1fd5b8
2019-07-24T01:52:38.221Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:38.221 WARN 14 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T01:52:38.224Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:38.224 INFO 14 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2019-07-24T01:52:38.253Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:38.252 WARN 14 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T01:52:38.262Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:38.261 INFO 14 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2019-07-24T01:52:44.286Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.285 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [After]
2019-07-24T01:52:44.289Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.288 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Before]
2019-07-24T01:52:44.289Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.289 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Between]
2019-07-24T01:52:44.289Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.289 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Cookie]
2019-07-24T01:52:44.293Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.290 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Header]
2019-07-24T01:52:44.293Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.293 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Host]
2019-07-24T01:52:44.298Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.298 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Method]
2019-07-24T01:52:44.300Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.298 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Path]
2019-07-24T01:52:44.301Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.301 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Query]
2019-07-24T01:52:44.301Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.301 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [ReadBodyPredicateFactory]
2019-07-24T01:52:44.301Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.301 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [RemoteAddr]
2019-07-24T01:52:44.301Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.301 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Weight]
2019-07-24T01:52:44.301Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:44.301 INFO 14 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [CloudFoundryRouteService]
2019-07-24T01:52:50.218Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:50.216 INFO 14 --- [ main] o.s.c.n.eureka.InstanceInfoFactory : Setting initial instance status as: STARTING
2019-07-24T01:52:50.437Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:50.432 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Initializing Eureka in region default
2019-07-24T01:52:51.274Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:51.274 INFO 14 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T01:52:51.282Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:51.281 INFO 14 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T01:52:51.294Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:51.293 INFO 14 --- [tificates.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/ssl/certs/ca-certificates.crt
2019-07-24T01:52:52.343Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:52.342 INFO 14 --- [ main] c.s.FileWatchingX509ExtendedTrustManager : Initialized TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T01:52:52.990Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:52.989 INFO 14 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON encoding codec LegacyJacksonJson
2019-07-24T01:52:52.992Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:52.990 INFO 14 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON decoding codec LegacyJacksonJson
2019-07-24T01:52:53.809Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:53.808 INFO 14 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML encoding codec XStreamXml
2019-07-24T01:52:53.809Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:53.809 INFO 14 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML decoding codec XStreamXml
2019-07-24T01:52:55.009Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:54.999 INFO 14 --- [ main] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T01:52:55.153Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.153 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Disable delta property : false
2019-07-24T01:52:55.153Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.153 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Single vip registry refresh property : null
2019-07-24T01:52:55.154Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.153 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Force full registry fetch : false
2019-07-24T01:52:55.154Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.154 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Application is null : false
2019-07-24T01:52:55.154Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.154 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Registered Applications size is zero : true
2019-07-24T01:52:55.154Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.154 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Application version is -1: true
2019-07-24T01:52:55.154Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.154 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Getting all instance registry info from the eureka server
2019-07-24T01:52:55.476Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.476 INFO 14 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T01:52:55.491Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.485 INFO 14 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding System Key Manager
2019-07-24T01:52:55.491Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.486 INFO 14 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding Key Manager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T01:52:55.510Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.509 INFO 14 --- [-instance.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.crt
2019-07-24T01:52:55.558Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.555 INFO 14 --- [-instance.key-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.key
2019-07-24T01:52:55.622Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:55.620 INFO 14 --- [ main] o.c.s.FileWatchingX509ExtendedKeyManager : Initialized KeyManager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T01:52:57.490Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.485 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : The response status is 200
2019-07-24T01:52:57.496Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.496 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Starting heartbeat executor: renew interval is: 30
2019-07-24T01:52:57.506Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.505 INFO 14 --- [ main] c.n.discovery.InstanceInfoReplicator : InstanceInfoReplicator onDemand update allowed rate per min is 4
2019-07-24T01:52:57.522Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.522 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Discovery Client initialized at timestamp 1563933177518 with initial instances count: 0
2019-07-24T01:52:57.529Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.529 INFO 14 --- [ main] o.s.c.n.e.s.EurekaServiceRegistry : Registering application PAL-GATEWAY with eureka with status UP
2019-07-24T01:52:57.531Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.530 INFO 14 --- [ main] com.netflix.discovery.DiscoveryClient : Saw local status change event StatusChangeEvent [timestamp=1563933177530, current=UP, previous=STARTING]
2019-07-24T01:52:57.565Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:57.564 INFO 14 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/b471c32a-c71a-4b20-61ee-9930: registering service...
2019-07-24T01:52:58.139Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:58.139 INFO 14 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/b471c32a-c71a-4b20-61ee-9930 - registration status: 204
2019-07-24T01:52:58.769Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:58.769 INFO 14 --- [ main] o.s.b.web.embedded.netty.NettyWebServer : Netty started on port(s): 8080
2019-07-24T01:52:58.773Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:58.773 INFO 14 --- [ main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8080
2019-07-24T01:52:58.776Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:52:58.776 INFO 14 --- [ main] i.p.g.palgateway.PalGatewayApplication : Started PalGatewayApplication in 36.265 seconds (JVM running for 38.888)
2019-07-24T01:53:00.321Z [CELL/0] [OUT] Container became healthy
2019-07-24T01:53:27.493Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Disable delta property : false
2019-07-24T01:53:27.493Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Single vip registry refresh property : null
2019-07-24T01:53:27.493Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Force full registry fetch : false
2019-07-24T01:53:27.493Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Application is null : false
2019-07-24T01:53:27.494Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Registered Applications size is zero : true
2019-07-24T01:53:27.494Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Application version is -1: false
2019-07-24T01:53:27.494Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:27.493 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : Getting all instance registry info from the eureka server
2019-07-24T01:53:28.039Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:53:28.038 INFO 14 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient : The response status is 200
2019-07-24T01:57:55.165Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:57:55.165 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T01:59:32.928Z [RTR/8] [OUT] poc-gateway-deal-maker.cfapps.io - [2019-07-24T01:59:32.515+0000] "GET / HTTP/1.1" 404 0 269 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" "10.10.66.62:59792" "10.10.149.163:61070" x_forwarded_for:"101.110.32.18, 10.10.66.62" x_forwarded_proto:"https" vcap_request_id:"0a087056-2e05-4ad1-6d3b-83a31e4fb52e" response_time:0.412271418 app_id:"67ca9100-2b65-43b8-96d2-0196456a9cd5" app_index:"0" x_b3_traceid:"9e124183d3650316" x_b3_spanid:"9e124183d3650316" x_b3_parentspanid:"-" b3:"9e124183d3650316-9e124183d3650316"
2019-07-24T01:59:33.358Z [RTR/5] [OUT] poc-gateway-deal-maker.cfapps.io - [2019-07-24T01:59:33.318+0000] "GET /favicon.ico HTTP/1.1" 404 0 269 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" "10.10.66.62:6402" "10.10.149.163:61070" x_forwarded_for:"101.110.32.18, 10.10.66.62" x_forwarded_proto:"https" vcap_request_id:"050500a2-0993-4937-400b-7ef47ea1d181" response_time:0.039922941 app_id:"67ca9100-2b65-43b8-96d2-0196456a9cd5" app_index:"0" x_b3_traceid:"118597ed45201c0f" x_b3_spanid:"118597ed45201c0f" x_b3_parentspanid:"-" b3:"118597ed45201c0f-118597ed45201c0f"
2019-07-24T01:59:44.255Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.253 INFO 14 --- [or-http-epoll-3] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T01:59:44.387Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.386 INFO 14 --- [or-http-epoll-3] c.netflix.config.ChainedDynamicProperty : Flipping property: account-server.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2019-07-24T01:59:44.472Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.471 INFO 14 --- [or-http-epoll-3] c.n.u.concurrent.ShutdownEnabledTimer : Shutdown hook installed for: NFLoadBalancer-PingTimer-account-server
2019-07-24T01:59:44.482Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.478 INFO 14 --- [or-http-epoll-3] c.netflix.loadbalancer.BaseLoadBalancer : Client: account-server instantiated a LoadBalancer: DynamicServerListLoadBalancer:{NFLoadBalancer:name=account-server,current list of Servers=[],Load balancer stats=Zone stats: {},Server stats: []}ServerList:null
2019-07-24T01:59:44.490Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.489 INFO 14 --- [or-http-epoll-3] c.n.l.DynamicServerListLoadBalancer : Using serverListUpdater PollingServerListUpdater
2019-07-24T01:59:44.559Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.558 INFO 14 --- [or-http-epoll-3] c.netflix.config.ChainedDynamicProperty : Flipping property: account-server.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2019-07-24T01:59:44.561Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.561 INFO 14 --- [or-http-epoll-3] c.n.l.DynamicServerListLoadBalancer : DynamicServerListLoadBalancer for client account-server initialized: DynamicServerListLoadBalancer:{NFLoadBalancer:name=account-server,current list of Servers=[poc-account-deal-maker.cfapps.io:cf0b8450-3e46-4216-7554-9d4f],Load balancer stats=Zone stats: {cfapps.io=[Zone:cfapps.io;	Instance count:1; Active connections count: 0;	Circuit breaker tripped count: 0;	Active connections per server: 0.0;]
2019-07-24T01:59:44.561Z [APP/PROC/WEB/0] [OUT] },Server stats: [[Server:poc-account-deal-maker.cfapps.io:cf0b8450-3e46-4216-7554-9d4f;	Zone:cfapps.io;	Total Requests:0;	Successive connection failure:0;	Total blackout seconds:0;	Last connection made:Thu Jan 01 00:00:00 UTC 1970;	First connection made: Thu Jan 01 00:00:00 UTC 1970;	Active Connections:0;	total failure count in last (1000) msecs:0;	average resp time:0.0;	90 percentile resp time:0.0;	95 percentile resp time:0.0;	min resp time:0.0;	max resp time:0.0;	stddev resp time:0.0]
2019-07-24T01:59:44.561Z [APP/PROC/WEB/0] [OUT] ]}ServerList:org.springframework.cloud.netflix.ribbon.eureka.DomainExtractingServerList@67b104f
2019-07-24T01:59:44.729Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.728 INFO 14 --- [or-http-epoll-3] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T01:59:44.753Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.753 INFO 14 --- [or-http-epoll-3] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T01:59:44.799Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:44.798 INFO 14 --- [or-http-epoll-3] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T01:59:45.154Z [RTR/7] [OUT] poc-gateway-deal-maker.cfapps.io - [2019-07-24T01:59:43.846+0000] "GET /api/account/guixin HTTP/1.1" 200 0 16 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" "10.10.66.62:26074" "10.10.149.163:61070" x_forwarded_for:"101.110.32.18, 10.10.66.62" x_forwarded_proto:"https" vcap_request_id:"3f521320-4c9b-4a14-6bd3-37445895ac5b" response_time:1.30777425 app_id:"67ca9100-2b65-43b8-96d2-0196456a9cd5" app_index:"0" x_b3_traceid:"bbb347e5430d817a" x_b3_spanid:"bbb347e5430d817a" x_b3_parentspanid:"-" b3:"bbb347e5430d817a-bbb347e5430d817a"
2019-07-24T01:59:45.498Z [APP/PROC/WEB/0] [OUT] 2019-07-24 01:59:45.498 INFO 14 --- [erListUpdater-0] c.netflix.config.ChainedDynamicProperty : Flipping property: account-server.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2019-07-24T01:59:56.890Z [RTR/8] [OUT] poc-gateway-deal-maker.cfapps.io - [2019-07-24T01:59:56.852+0000] "GET /api/account/guixin HTTP/1.1" 200 0 16 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" "10.10.66.62:59792" "10.10.149.163:61070" x_forwarded_for:"101.110.32.18, 10.10.66.62" x_forwarded_proto:"https" vcap_request_id:"feb43da8-f298-4dd3-6d99-cb67455fa641" response_time:0.038671774 app_id:"67ca9100-2b65-43b8-96d2-0196456a9cd5" app_index:"0" x_b3_traceid:"c92742e4bee360c3" x_b3_spanid:"c92742e4bee360c3" x_b3_parentspanid:"-" b3:"c92742e4bee360c3-c92742e4bee360c3"
2019-07-24T02:02:55.166Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:02:55.165 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:07:55.166Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:07:55.166 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:12:55.170Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:12:55.170 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:17:55.172Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:17:55.171 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:22:55.172Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:22:55.172 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:27:55.173Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:27:55.173 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:32:55.174Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:32:55.174 INFO 14 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:33:31.534Z [API/19] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"buildpack"=>"", "disk_quota"=>1024, "health_check_http_endpoint"=>"", "health_check_type"=>"port", "instances"=>1, "memory"=>1024, "name"=>"poc-gateway", "space_guid"=>"9aa73bae-0679-422c-b25b-2ad2780c435c"})
2019-07-24T02:33:36.995Z [API/17] [OUT] Uploading bits for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:33:39.772Z [CELL/0] [OUT] Cell a32a5e3a-75de-4118-9041-9e2be7c61855 stopping instance b471c32a-c71a-4b20-61ee-9930
2019-07-24T02:33:40.071Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance 4864c1b1-212e-4ad1-7f81-6af0
2019-07-24T02:33:40.580Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance 4864c1b1-212e-4ad1-7f81-6af0
2019-07-24T02:33:40.739Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:33:45.022Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.011 INFO 14 --- [ Thread-19] c.n.l.PollingServerListUpdater : Shutting down the Executor Pool for PollingServerListUpdater
2019-07-24T02:33:45.022Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.021 INFO 14 --- [ Thread-12] o.s.c.n.e.s.EurekaServiceRegistry : Unregistering application PAL-GATEWAY with eureka with status DOWN
2019-07-24T02:33:45.022Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.022 WARN 14 --- [ Thread-12] com.netflix.discovery.DiscoveryClient : Saw local status change event StatusChangeEvent [timestamp=1563935625022, current=DOWN, previous=UP]
2019-07-24T02:33:45.022Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.022 INFO 14 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/b471c32a-c71a-4b20-61ee-9930: registering service...
2019-07-24T02:33:45.036Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:33:45.075Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.074 INFO 14 --- [ Thread-12] c.n.u.concurrent.ShutdownEnabledTimer : Shutdown hook removed for: NFLoadBalancer-PingTimer-account-server
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.088 INFO 14 --- [ Thread-12] c.n.u.concurrent.ShutdownEnabledTimer : Exception caught (might be ok if at shutdown)
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] java.lang.IllegalStateException: Shutdown in progress
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at java.lang.ApplicationShutdownHooks.remove(ApplicationShutdownHooks.java:82) ~[na:1.8.0_222]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at java.lang.Runtime.removeShutdownHook(Runtime.java:239) ~[na:1.8.0_222]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at com.netflix.util.concurrent.ShutdownEnabledTimer.cancel(ShutdownEnabledTimer.java:70) ~[netflix-commons-util-0.3.0.jar!/:0.3.0]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at com.netflix.loadbalancer.BaseLoadBalancer.cancelPingTask(BaseLoadBalancer.java:632) [ribbon-loadbalancer-2.3.0.jar!/:2.3.0]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at com.netflix.loadbalancer.BaseLoadBalancer.shutdown(BaseLoadBalancer.java:883) [ribbon-loadbalancer-2.3.0.jar!/:2.3.0]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at com.netflix.loadbalancer.DynamicServerListLoadBalancer.shutdown(DynamicServerListLoadBalancer.java:285) [ribbon-loadbalancer-2.3.0.jar!/:2.3.0]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_222]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_222]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_222]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_222]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DisposableBeanAdapter.invokeCustomDestroyMethod(DisposableBeanAdapter.java:339) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DisposableBeanAdapter.destroy(DisposableBeanAdapter.java:273) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroyBean(DefaultSingletonBeanRegistry.java:571) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingleton(DefaultSingletonBeanRegistry.java:543) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton(DefaultListableBeanFactory.java:1036) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingletons(DefaultSingletonBeanRegistry.java:504) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingletons(DefaultListableBeanFactory.java:1029) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext.destroyBeans(AbstractApplicationContext.java:1057) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext.doClose(AbstractApplicationContext.java:1026) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext.close(AbstractApplicationContext.java:975) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.cloud.context.named.NamedContextFactory.destroy(NamedContextFactory.java:92) [spring-cloud-context-2.1.2.RELEASE.jar!/:2.1.2.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DisposableBeanAdapter.destroy(DisposableBeanAdapter.java:258) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.095Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext$1.run(AbstractApplicationContext.java:945) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:33:45.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.143 INFO 14 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/b471c32a-c71a-4b20-61ee-9930 - registration status: 204
2019-07-24T02:33:45.346Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:45.345 INFO 14 --- [ Thread-12] com.netflix.discovery.DiscoveryClient : Shutting down DiscoveryClient ...
2019-07-24T02:33:47.805Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T02:33:47.806Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:33:48.107Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:33:48.355Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:48.347 INFO 14 --- [ Thread-12] com.netflix.discovery.DiscoveryClient : Unregistering ...
2019-07-24T02:33:48.378Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:48.377 INFO 14 --- [ Thread-12] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/b471c32a-c71a-4b20-61ee-9930 - deregister status: 200
2019-07-24T02:33:48.422Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:48.422 INFO 14 --- [ Thread-12] com.netflix.discovery.DiscoveryClient : Completed shut down of DiscoveryClient
2019-07-24T02:33:48.903Z [APP/PROC/WEB/0] [OUT] Exit status 143
2019-07-24T02:33:48.917Z [CELL/0] [OUT] Cell a32a5e3a-75de-4118-9041-9e2be7c61855 destroying container for instance b471c32a-c71a-4b20-61ee-9930
2019-07-24T02:33:49.224Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:33:49.903Z [CELL/0] [OUT] Cell a32a5e3a-75de-4118-9041-9e2be7c61855 successfully destroyed container for instance b471c32a-c71a-4b20-61ee-9930
2019-07-24T02:33:51.375Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:51.370 INFO 8 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:33:51.377Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:51.376 INFO 8 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:33:51.886Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:51.886 INFO 8 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b64749f1] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:33:52.265Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:33:52.266Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:33:52.266Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:33:52.267Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:33:52.267Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:33:52.267Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:33:52.268Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:33:52.306Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:52.305 INFO 8 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:33:52.306Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:52.306 INFO 8 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:33:52.309Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:52.309 INFO 8 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:33:54.013Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.013 INFO 8 --- [ main] o.s.cloud.context.scope.GenericScope : BeanFactory id=36109046-3f05-36f1-b12f-6ab982b80942
2019-07-24T02:33:54.020Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.019 INFO 8 --- [ main] eReconfigurationBeanFactoryPostProcessor : Skipping reconfiguration because cloud services already configured
2019-07-24T02:33:54.199Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.199 INFO 8 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b64749f1] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:33:54.450Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance 4864c1b1-212e-4ad1-7f81-6af0
2019-07-24T02:33:54.454Z [API/0] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STOPPED"})
2019-07-24T02:33:54.721Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.721 INFO 8 --- [ main] ctiveUserDetailsServiceAutoConfiguration :
2019-07-24T02:33:54.721Z [APP/PROC/WEB/0] [OUT] Using generated security password: 6d1d8861-ce42-466e-ba6c-5a661f7b614b
2019-07-24T02:33:54.897Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.897 WARN 8 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T02:33:54.897Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.897 INFO 8 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2019-07-24T02:33:54.907Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.906 WARN 8 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T02:33:54.907Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:54.907 INFO 8 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2019-07-24T02:33:55.000Z [API/17] [OUT] Creating build for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:33:55.959Z [API/17] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STARTED"})
2019-07-24T02:33:56.069Z [STG/0] [OUT] Downloading dotnet_core_buildpack_beta...
2019-07-24T02:33:56.069Z [STG/0] [OUT] Downloading dotnet_core_buildpack...
2019-07-24T02:33:56.071Z [STG/0] [OUT] Downloading staticfile_buildpack...
2019-07-24T02:33:56.071Z [STG/0] [OUT] Downloading java_buildpack...
2019-07-24T02:33:56.099Z [STG/0] [OUT] Downloading ruby_buildpack...
2019-07-24T02:33:56.109Z [STG/0] [OUT] Downloaded dotnet_core_buildpack_beta
2019-07-24T02:33:56.109Z [STG/0] [OUT] Downloading python_buildpack...
2019-07-24T02:33:56.124Z [STG/0] [OUT] Downloaded dotnet_core_buildpack
2019-07-24T02:33:56.125Z [STG/0] [OUT] Downloading nodejs_buildpack...
2019-07-24T02:33:56.126Z [STG/0] [OUT] Downloaded java_buildpack
2019-07-24T02:33:56.126Z [STG/0] [OUT] Downloading go_buildpack...
2019-07-24T02:33:56.146Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.146 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [After]
2019-07-24T02:33:56.146Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.146 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Before]
2019-07-24T02:33:56.146Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.146 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Between]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.146 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Cookie]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.146 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Header]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Host]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Method]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Path]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Query]
2019-07-24T02:33:56.147Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [ReadBodyPredicateFactory]
2019-07-24T02:33:56.148Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [RemoteAddr]
2019-07-24T02:33:56.148Z [STG/0] [OUT] Downloaded python_buildpack
2019-07-24T02:33:56.148Z [STG/0] [OUT] Downloading php_buildpack...
2019-07-24T02:33:56.149Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Weight]
2019-07-24T02:33:56.149Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:56.147 INFO 8 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [CloudFoundryRouteService]
2019-07-24T02:33:56.151Z [STG/0] [OUT] Downloaded go_buildpack
2019-07-24T02:33:56.151Z [STG/0] [OUT] Downloading binary_buildpack...
2019-07-24T02:33:56.156Z [STG/0] [OUT] Downloaded ruby_buildpack
2019-07-24T02:33:56.164Z [STG/0] [OUT] Downloaded php_buildpack
2019-07-24T02:33:56.169Z [STG/0] [OUT] Downloaded nodejs_buildpack
2019-07-24T02:33:56.170Z [STG/0] [OUT] Downloaded staticfile_buildpack
2019-07-24T02:33:56.182Z [STG/0] [OUT] Downloaded binary_buildpack
2019-07-24T02:33:56.182Z [STG/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance a748e418-60bb-41a7-aec5-70e68a852897
2019-07-24T02:33:56.932Z [STG/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance a748e418-60bb-41a7-aec5-70e68a852897
2019-07-24T02:33:57.177Z [STG/0] [OUT] Downloading app package...
2019-07-24T02:33:57.177Z [STG/0] [OUT] Downloading build artifacts cache...
2019-07-24T02:33:57.323Z [STG/0] [OUT] Downloaded build artifacts cache (130B)
2019-07-24T02:33:57.501Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:57.501 INFO 8 --- [ main] o.s.c.n.eureka.InstanceInfoFactory : Setting initial instance status as: STARTING
2019-07-24T02:33:57.610Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:57.603 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Initializing Eureka in region default
2019-07-24T02:33:57.813Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:57.813 INFO 8 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:33:57.814Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:57.814 INFO 8 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:33:57.832Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:57.832 INFO 8 --- [tificates.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:33:58.064Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:58.063 INFO 8 --- [ main] c.s.FileWatchingX509ExtendedTrustManager : Initialized TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:33:58.189Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:58.188 INFO 8 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON encoding codec LegacyJacksonJson
2019-07-24T02:33:58.189Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:58.189 INFO 8 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON decoding codec LegacyJacksonJson
2019-07-24T02:33:58.571Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:58.570 INFO 8 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML encoding codec XStreamXml
2019-07-24T02:33:58.574Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:58.571 INFO 8 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML decoding codec XStreamXml
2019-07-24T02:33:59.063Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.063 INFO 8 --- [ main] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:33:59.104Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Disable delta property : false
2019-07-24T02:33:59.104Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Single vip registry refresh property : null
2019-07-24T02:33:59.104Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Force full registry fetch : false
2019-07-24T02:33:59.104Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Application is null : false
2019-07-24T02:33:59.105Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Registered Applications size is zero : true
2019-07-24T02:33:59.105Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Application version is -1: true
2019-07-24T02:33:59.105Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.104 INFO 8 --- [ main] com.netflix.discovery.DiscoveryClient : Getting all instance registry info from the eureka server
2019-07-24T02:33:59.310Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.310 INFO 8 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:33:59.319Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.319 INFO 8 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding System Key Manager
2019-07-24T02:33:59.321Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.320 INFO 8 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding Key Manager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T02:33:59.346Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.345 INFO 8 --- [-instance.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.crt
2019-07-24T02:33:59.348Z [STG/0] [OUT] Downloaded app package (40.2M)
2019-07-24T02:33:59.349Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.348 INFO 8 --- [-instance.key-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.key
2019-07-24T02:33:59.372Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:33:59.371 INFO 8 --- [ main] o.c.s.FileWatchingX509ExtendedKeyManager : Initialized KeyManager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T02:33:59.604Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:33:59.989Z [APP/PROC/WEB/0] [OUT] Exit status 143
2019-07-24T02:34:00.003Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance 4864c1b1-212e-4ad1-7f81-6af0
2019-07-24T02:34:00.209Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:34:00.474Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance 4864c1b1-212e-4ad1-7f81-6af0
2019-07-24T02:34:02.790Z [STG/0] [OUT] [1m[31m----->[0m[22m [1m[34mJava Buildpack[0m[22m [34mv4.20[0m [34m(offline)[0m | https://github.com/cloudfoundry/java-buildpack.git#2cd7e3e
2019-07-24T02:34:02.849Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mJvmkill Agent[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so [3m[32m(found in cache)[0m[23m
2019-07-24T02:34:02.852Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen Jdk JRE[0m[22m [34m1.8.0_222[0m from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/openjdk-jre-1.8.0_222-bionic.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T02:34:03.872Z [STG/0] [OUT] Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre [3m[32m(1.0s)[0m[23m
2019-07-24T02:34:03.873Z [STG/0] [OUT] JVM DNS caching disabled in lieu of BOSH DNS caching
2019-07-24T02:34:03.874Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen JDK Like Memory Calculator[0m[22m [34m3.13.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T02:34:05.145Z [STG/0] [OUT] Loaded Classes: 18985, Threads: 250
2019-07-24T02:34:05.162Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mClient Certificate Mapper[0m[22m [34m1.8.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.8.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:34:05.163Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mContainer Security Provider[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.16.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:34:05.164Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mSpring Auto Reconfiguration[0m[22m [34m2.7.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.7.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:34:16.300Z [STG/0] [OUT] Exit status 0
2019-07-24T02:34:16.300Z [STG/0] [OUT] Uploading droplet, build artifacts cache...
2019-07-24T02:34:16.300Z [STG/0] [OUT] Uploading droplet...
2019-07-24T02:34:16.300Z [STG/0] [OUT] Uploading build artifacts cache...
2019-07-24T02:34:16.378Z [STG/0] [OUT] Uploaded build artifacts cache (130B)
2019-07-24T02:34:17.428Z [API/17] [OUT] Creating droplet for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:34:20.688Z [STG/0] [OUT] Uploaded droplet (83.7M)
2019-07-24T02:34:20.706Z [STG/0] [OUT] Uploading complete
2019-07-24T02:34:20.847Z [STG/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance a748e418-60bb-41a7-aec5-70e68a852897
2019-07-24T02:34:20.847Z [STG/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance a748e418-60bb-41a7-aec5-70e68a852897
2019-07-24T02:34:21.227Z [STG/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance a748e418-60bb-41a7-aec5-70e68a852897
2019-07-24T02:34:21.499Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance 67d7f9d0-aeea-4416-435c-59e6
2019-07-24T02:34:22.100Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance 67d7f9d0-aeea-4416-435c-59e6
2019-07-24T02:34:22.724Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:34:26.434Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T02:34:26.434Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:34:26.913Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:34:31.667Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:31.660 INFO 11 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:34:31.671Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:31.670 INFO 11 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:34:32.468Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:32.468 INFO 11 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$468450b1] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:34:32.805Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:34:32.805Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:34:32.805Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:34:32.806Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:34:32.806Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:34:32.806Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:34:32.807Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:34:32.835Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:32.835 INFO 11 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:34:32.836Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:32.836 INFO 11 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:34:32.840Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:32.840 INFO 11 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:34:34.259Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:34.258 WARN 11 --- [ main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'eurekaInstanceConfigBean' defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]: Cannot register bean definition [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=io.pivotal.spring.cloud.service.eureka.EurekaInstanceAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]] for bean 'eurekaInstanceConfigBean': There is already [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class]] bound.
2019-07-24T02:34:34.288Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:34.288 INFO 11 --- [ main] ConditionEvaluationReportLoggingListener :
2019-07-24T02:34:34.288Z [APP/PROC/WEB/0] [OUT] Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:34.299 ERROR 11 --- [ main] o.s.b.d.LoggingFailureAnalysisReporter :
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] ***************************
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] APPLICATION FAILED TO START
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] Description:
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] The bean 'eurekaInstanceConfigBean', defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class] and overriding is disabled.
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] Action:
2019-07-24T02:34:34.300Z [APP/PROC/WEB/0] [OUT] Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
2019-07-24T02:34:34.484Z [APP/PROC/WEB/0] [OUT] Exit status 1
2019-07-24T02:34:34.487Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:34:43.319Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance 67d7f9d0-aeea-4416-435c-59e6
2019-07-24T02:34:43.319Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance 67d7f9d0-aeea-4416-435c-59e6
2019-07-24T02:34:43.325Z [API/5] [OUT] Process has crashed with type: "web"
2019-07-24T02:34:43.345Z [API/5] [OUT] App instance exited with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 payload: {"instance"=>"67d7f9d0-aeea-4416-435c-59e6", "index"=>0, "cell_id"=>"2440170a-656c-492a-82e8-da4cdbd1373c", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>1, "crash_timestamp"=>1563935683294804135, "version"=>"0adeddb5-d399-44fa-a98b-52ad29134b5f"}
2019-07-24T02:34:43.491Z [CELL/0] [OUT] Cell e222f891-b602-4a15-9b26-fd45771f60ad creating container for instance 2acd654f-35c8-411c-4131-c83b
2019-07-24T02:34:44.185Z [CELL/0] [OUT] Cell e222f891-b602-4a15-9b26-fd45771f60ad successfully created container for instance 2acd654f-35c8-411c-4131-c83b
2019-07-24T02:34:44.304Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:34:44.369Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance 67d7f9d0-aeea-4416-435c-59e6
2019-07-24T02:34:44.479Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:34:47.338Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T02:34:47.339Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:34:47.691Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:34:50.992Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:50.988 INFO 21 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:34:50.994Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:50.994 INFO 21 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:34:51.488Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:51.487 INFO 21 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$f0131f26] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:34:51.763Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:34:51.763Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:34:51.764Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:34:51.764Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:34:51.764Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:34:51.764Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:34:51.765Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:34:51.788Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:51.787 INFO 21 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:34:51.788Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:51.788 INFO 21 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:34:51.791Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:51.791 INFO 21 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:34:53.050Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:53.048 WARN 21 --- [ main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'eurekaInstanceConfigBean' defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]: Cannot register bean definition [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=io.pivotal.spring.cloud.service.eureka.EurekaInstanceAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]] for bean 'eurekaInstanceConfigBean': There is already [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class]] bound.
2019-07-24T02:34:53.069Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:53.069 INFO 21 --- [ main] ConditionEvaluationReportLoggingListener :
2019-07-24T02:34:53.069Z [APP/PROC/WEB/0] [OUT] Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:34:53.075 ERROR 21 --- [ main] o.s.b.d.LoggingFailureAnalysisReporter :
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] ***************************
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] APPLICATION FAILED TO START
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] Description:
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] The bean 'eurekaInstanceConfigBean', defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class] and overriding is disabled.
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] Action:
2019-07-24T02:34:53.075Z [APP/PROC/WEB/0] [OUT] Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
2019-07-24T02:34:53.170Z [APP/PROC/WEB/0] [OUT] Exit status 1
2019-07-24T02:34:53.173Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:34:58.684Z [CELL/0] [OUT] Cell e222f891-b602-4a15-9b26-fd45771f60ad stopping instance 2acd654f-35c8-411c-4131-c83b
2019-07-24T02:34:58.684Z [CELL/0] [OUT] Cell e222f891-b602-4a15-9b26-fd45771f60ad destroying container for instance 2acd654f-35c8-411c-4131-c83b
2019-07-24T02:34:58.700Z [API/20] [OUT] Process has crashed with type: "web"
2019-07-24T02:34:58.717Z [API/20] [OUT] App instance exited with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 payload: {"instance"=>"2acd654f-35c8-411c-4131-c83b", "index"=>0, "cell_id"=>"e222f891-b602-4a15-9b26-fd45771f60ad", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>2, "crash_timestamp"=>1563935698656938996, "version"=>"0adeddb5-d399-44fa-a98b-52ad29134b5f"}
2019-07-24T02:34:58.877Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance 96f5a8b3-525a-41c4-4e3c-7c4b
2019-07-24T02:34:58.909Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:34:59.240Z [CELL/0] [OUT] Cell e222f891-b602-4a15-9b26-fd45771f60ad successfully destroyed container for instance 2acd654f-35c8-411c-4131-c83b
2019-07-24T02:34:59.376Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance 96f5a8b3-525a-41c4-4e3c-7c4b
2019-07-24T02:34:59.671Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:35:00.192Z [CELL/0] [OUT] Downloaded droplet
2019-07-24T02:35:00.193Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:35:00.767Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:35:05.364Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:05.358 INFO 6 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:35:05.367Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:05.366 INFO 6 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:35:06.025Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:06.025 INFO 6 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$469fcdad] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:35:06.425Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:35:06.425Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:35:06.426Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:35:06.426Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:35:06.426Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:35:06.426Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:35:06.427Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:35:06.463Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:06.462 INFO 6 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:35:06.463Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:06.462 INFO 6 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:35:06.467Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:06.467 INFO 6 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:35:08.029Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:08.029 WARN 6 --- [ main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'eurekaInstanceConfigBean' defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]: Cannot register bean definition [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=io.pivotal.spring.cloud.service.eureka.EurekaInstanceAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]] for bean 'eurekaInstanceConfigBean': There is already [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class]] bound.
2019-07-24T02:35:08.067Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:08.066 INFO 6 --- [ main] ConditionEvaluationReportLoggingListener :
2019-07-24T02:35:08.067Z [APP/PROC/WEB/0] [OUT] Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:35:08.082 ERROR 6 --- [ main] o.s.b.d.LoggingFailureAnalysisReporter :
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] ***************************
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] APPLICATION FAILED TO START
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] Description:
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] The bean 'eurekaInstanceConfigBean', defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class] and overriding is disabled.
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] Action:
2019-07-24T02:35:08.082Z [APP/PROC/WEB/0] [OUT] Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
2019-07-24T02:35:08.182Z [APP/PROC/WEB/0] [OUT] Exit status 1
2019-07-24T02:35:08.185Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:35:14.125Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance 96f5a8b3-525a-41c4-4e3c-7c4b
2019-07-24T02:35:14.125Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance 96f5a8b3-525a-41c4-4e3c-7c4b
2019-07-24T02:35:14.148Z [API/8] [OUT] Process has crashed with type: "web"
2019-07-24T02:35:14.161Z [API/8] [OUT] App instance exited with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 payload: {"instance"=>"96f5a8b3-525a-41c4-4e3c-7c4b", "index"=>0, "cell_id"=>"2440170a-656c-492a-82e8-da4cdbd1373c", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>3, "crash_timestamp"=>1563935714116214596, "version"=>"0adeddb5-d399-44fa-a98b-52ad29134b5f"}
2019-07-24T02:35:15.524Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:35:15.624Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance 96f5a8b3-525a-41c4-4e3c-7c4b
2019-07-24T02:36:12.356Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance 700676a0-4982-4849-6d85-bb00
2019-07-24T02:36:13.060Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance 700676a0-4982-4849-6d85-bb00
2019-07-24T02:36:13.252Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:36:13.822Z [CELL/0] [OUT] Downloaded droplet
2019-07-24T02:36:13.822Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:36:14.563Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:36:20.423Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:20.415 INFO 9 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:36:20.425Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:20.425 INFO 9 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:36:21.407Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:21.407 INFO 9 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$f9c07f94] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:36:21.899Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:36:21.899Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:36:21.899Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:36:21.899Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:36:21.899Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:36:21.899Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:36:21.900Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:36:21.933Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:21.932 INFO 9 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:36:21.933Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:21.933 INFO 9 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:36:21.936Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:21.935 INFO 9 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:36:24.065Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:24.065 WARN 9 --- [ main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'eurekaInstanceConfigBean' defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]: Cannot register bean definition [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=io.pivotal.spring.cloud.service.eureka.EurekaInstanceAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]] for bean 'eurekaInstanceConfigBean': There is already [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class]] bound.
2019-07-24T02:36:24.096Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:24.095 INFO 9 --- [ main] ConditionEvaluationReportLoggingListener :
2019-07-24T02:36:24.096Z [APP/PROC/WEB/0] [OUT] Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2019-07-24T02:36:24.108Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:36:24.108 ERROR 9 --- [ main] o.s.b.d.LoggingFailureAnalysisReporter :
2019-07-24T02:36:24.109Z [APP/PROC/WEB/0] [OUT] ***************************
2019-07-24T02:36:24.109Z [APP/PROC/WEB/0] [OUT] APPLICATION FAILED TO START
2019-07-24T02:36:24.109Z [APP/PROC/WEB/0] [OUT] Description:
2019-07-24T02:36:24.109Z [APP/PROC/WEB/0] [OUT] The bean 'eurekaInstanceConfigBean', defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class] and overriding is disabled.
2019-07-24T02:36:24.109Z [APP/PROC/WEB/0] [OUT] Action:
2019-07-24T02:36:24.109Z [APP/PROC/WEB/0] [OUT] Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
2019-07-24T02:36:24.217Z [APP/PROC/WEB/0] [OUT] Exit status 1
2019-07-24T02:36:24.221Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:36:29.971Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance 700676a0-4982-4849-6d85-bb00
2019-07-24T02:36:29.971Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance 700676a0-4982-4849-6d85-bb00
2019-07-24T02:36:29.994Z [API/4] [OUT] Process has crashed with type: "web"
2019-07-24T02:36:30.010Z [API/4] [OUT] App instance exited with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 payload: {"instance"=>"700676a0-4982-4849-6d85-bb00", "index"=>0, "cell_id"=>"2440170a-656c-492a-82e8-da4cdbd1373c", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>4, "crash_timestamp"=>1563935789961968684, "version"=>"0adeddb5-d399-44fa-a98b-52ad29134b5f"}
2019-07-24T02:36:31.121Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:36:31.187Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance 700676a0-4982-4849-6d85-bb00
2019-07-24T02:37:46.918Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance 4a39d3d5-d294-4134-53dd-9f91
2019-07-24T02:37:47.354Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance 4a39d3d5-d294-4134-53dd-9f91
2019-07-24T02:37:47.715Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:37:48.290Z [CELL/0] [OUT] Downloaded droplet
2019-07-24T02:37:48.291Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:37:48.696Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:37:53.082Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:53.078 INFO 12 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:37:53.085Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:53.084 INFO 12 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:37:53.762Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:53.760 INFO 12 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b705fc0d] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:37:54.302Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:37:54.302Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:37:54.302Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:37:54.302Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:37:54.303Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:37:54.303Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:37:54.304Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:37:54.330Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:54.330 INFO 12 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:37:54.330Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:54.330 INFO 12 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:37:54.333Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:54.332 INFO 12 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:37:55.777Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:55.777 WARN 12 --- [ main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.support.BeanDefinitionOverrideException: Invalid bean definition with name 'eurekaInstanceConfigBean' defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]: Cannot register bean definition [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=io.pivotal.spring.cloud.service.eureka.EurekaInstanceAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class]] for bean 'eurekaInstanceConfigBean': There is already [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration; factoryMethodName=eurekaInstanceConfigBean; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class]] bound.
2019-07-24T02:37:55.800Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:55.799 INFO 12 --- [ main] ConditionEvaluationReportLoggingListener :
2019-07-24T02:37:55.800Z [APP/PROC/WEB/0] [OUT] Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:37:55.805 ERROR 12 --- [ main] o.s.b.d.LoggingFailureAnalysisReporter :
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] ***************************
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] APPLICATION FAILED TO START
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] Description:
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] The bean 'eurekaInstanceConfigBean', defined in class path resource [io/pivotal/spring/cloud/service/eureka/EurekaInstanceAutoConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/cloud/netflix/eureka/EurekaClientAutoConfiguration.class] and overriding is disabled.
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] Action:
2019-07-24T02:37:55.806Z [APP/PROC/WEB/0] [OUT] Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
2019-07-24T02:37:55.871Z [APP/PROC/WEB/0] [OUT] Exit status 1
2019-07-24T02:37:55.874Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:38:02.095Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance 4a39d3d5-d294-4134-53dd-9f91
2019-07-24T02:38:02.095Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance 4a39d3d5-d294-4134-53dd-9f91
2019-07-24T02:38:02.120Z [API/3] [OUT] Process has crashed with type: "web"
2019-07-24T02:38:02.129Z [API/3] [OUT] App instance exited with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 payload: {"instance"=>"4a39d3d5-d294-4134-53dd-9f91", "index"=>0, "cell_id"=>"2440170a-656c-492a-82e8-da4cdbd1373c", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>5, "crash_timestamp"=>1563935882086067954, "version"=>"0adeddb5-d399-44fa-a98b-52ad29134b5f"}
2019-07-24T02:38:02.333Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:38:02.556Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance 4a39d3d5-d294-4134-53dd-9f91
2019-07-24T02:38:45.147Z [API/12] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"buildpack"=>"", "disk_quota"=>1024, "health_check_http_endpoint"=>"", "health_check_type"=>"port", "instances"=>1, "memory"=>1024, "name"=>"poc-gateway", "space_guid"=>"9aa73bae-0679-422c-b25b-2ad2780c435c"})
2019-07-24T02:38:51.237Z [API/14] [OUT] Uploading bits for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:39:02.591Z [API/5] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STOPPED"})
2019-07-24T02:39:03.050Z [API/18] [OUT] Creating build for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:39:03.885Z [API/18] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STARTED"})
2019-07-24T02:39:09.431Z [STG/0] [OUT] Downloading dotnet_core_buildpack_beta...
2019-07-24T02:39:09.431Z [STG/0] [OUT] Downloading staticfile_buildpack...
2019-07-24T02:39:09.431Z [STG/0] [OUT] Downloading dotnet_core_buildpack...
2019-07-24T02:39:09.432Z [STG/0] [OUT] Downloading java_buildpack...
2019-07-24T02:39:09.461Z [STG/0] [OUT] Downloading ruby_buildpack...
2019-07-24T02:39:09.476Z [STG/0] [OUT] Downloaded dotnet_core_buildpack_beta
2019-07-24T02:39:09.476Z [STG/0] [OUT] Downloading php_buildpack...
2019-07-24T02:39:09.484Z [STG/0] [OUT] Downloaded dotnet_core_buildpack
2019-07-24T02:39:09.484Z [STG/0] [OUT] Downloading nodejs_buildpack...
2019-07-24T02:39:09.486Z [STG/0] [OUT] Downloaded java_buildpack
2019-07-24T02:39:09.486Z [STG/0] [OUT] Downloading go_buildpack...
2019-07-24T02:39:09.493Z [STG/0] [OUT] Downloaded staticfile_buildpack
2019-07-24T02:39:09.493Z [STG/0] [OUT] Downloading python_buildpack...
2019-07-24T02:39:09.501Z [STG/0] [OUT] Downloaded ruby_buildpack
2019-07-24T02:39:09.501Z [STG/0] [OUT] Downloading binary_buildpack...
2019-07-24T02:39:09.522Z [STG/0] [OUT] Downloaded go_buildpack
2019-07-24T02:39:09.525Z [STG/0] [OUT] Downloaded php_buildpack
2019-07-24T02:39:09.529Z [STG/0] [OUT] Downloaded nodejs_buildpack
2019-07-24T02:39:09.533Z [STG/0] [OUT] Downloaded python_buildpack
2019-07-24T02:39:09.545Z [STG/0] [OUT] Downloaded binary_buildpack
2019-07-24T02:39:09.545Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 creating container for instance dd6f00ec-f685-43fa-a2eb-d0cf33765364
2019-07-24T02:39:10.413Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 successfully created container for instance dd6f00ec-f685-43fa-a2eb-d0cf33765364
2019-07-24T02:39:11.020Z [STG/0] [OUT] Downloading build artifacts cache...
2019-07-24T02:39:11.021Z [STG/0] [OUT] Downloading app package...
2019-07-24T02:39:11.165Z [STG/0] [OUT] Downloaded build artifacts cache (130B)
2019-07-24T02:39:12.839Z [STG/0] [OUT] Downloaded app package (40.2M)
2019-07-24T02:39:16.181Z [STG/0] [OUT] [1m[31m----->[0m[22m [1m[34mJava Buildpack[0m[22m [34mv4.20[0m [34m(offline)[0m | https://github.com/cloudfoundry/java-buildpack.git#2cd7e3e
2019-07-24T02:39:16.243Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mJvmkill Agent[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so [3m[32m(found in cache)[0m[23m
2019-07-24T02:39:16.247Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen Jdk JRE[0m[22m [34m1.8.0_222[0m from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/openjdk-jre-1.8.0_222-bionic.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T02:39:17.449Z [STG/0] [OUT] Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre [3m[32m(1.2s)[0m[23m
2019-07-24T02:39:17.449Z [STG/0] [OUT] JVM DNS caching disabled in lieu of BOSH DNS caching
2019-07-24T02:39:17.449Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen JDK Like Memory Calculator[0m[22m [34m3.13.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T02:39:18.841Z [STG/0] [OUT] Loaded Classes: 18985, Threads: 250
2019-07-24T02:39:18.864Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mClient Certificate Mapper[0m[22m [34m1.8.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.8.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:39:18.865Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mContainer Security Provider[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.16.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:39:18.866Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mSpring Auto Reconfiguration[0m[22m [34m2.7.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.7.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:39:31.545Z [STG/0] [OUT] Exit status 0
2019-07-24T02:39:31.545Z [STG/0] [OUT] Uploading droplet, build artifacts cache...
2019-07-24T02:39:31.545Z [STG/0] [OUT] Uploading droplet...
2019-07-24T02:39:31.546Z [STG/0] [OUT] Uploading build artifacts cache...
2019-07-24T02:39:31.681Z [STG/0] [OUT] Uploaded build artifacts cache (130B)
2019-07-24T02:39:32.732Z [API/7] [OUT] Creating droplet for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:39:37.073Z [STG/0] [OUT] Uploaded droplet (83.7M)
2019-07-24T02:39:37.093Z [STG/0] [OUT] Uploading complete
2019-07-24T02:39:37.231Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 stopping instance dd6f00ec-f685-43fa-a2eb-d0cf33765364
2019-07-24T02:39:37.231Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 destroying container for instance dd6f00ec-f685-43fa-a2eb-d0cf33765364
2019-07-24T02:39:37.661Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance cfab4c58-a5ba-4765-61b7-c7fb
2019-07-24T02:39:38.108Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance cfab4c58-a5ba-4765-61b7-c7fb
2019-07-24T02:39:38.123Z [STG/0] [OUT] Cell 4802940a-cbac-42bf-a303-addf379cd417 successfully destroyed container for instance dd6f00ec-f685-43fa-a2eb-d0cf33765364
2019-07-24T02:39:38.536Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:39:41.710Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T02:39:41.711Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:39:42.087Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:39:46.819Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:46.812 INFO 12 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:39:46.822Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:46.822 INFO 12 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:39:47.691Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:47.682 INFO 12 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$a8a4d3aa] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:39:48.501Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:39:48.506Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:39:48.506Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:39:48.506Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:39:48.506Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:39:48.506Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:39:48.506Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:39:48.589Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:48.588 INFO 12 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:39:48.589Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:48.589 INFO 12 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:39:48.628Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:48.627 INFO 12 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:39:54.582Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:54.581 INFO 12 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$a8a4d3aa] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:39:56.043Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:56.034 INFO 12 --- [ main] ctiveUserDetailsServiceAutoConfiguration :
2019-07-24T02:39:56.065Z [APP/PROC/WEB/0] [OUT] Using generated security password: 39c7ebaf-7cab-4c83-8af9-280ddb610b4d
2019-07-24T02:39:58.125Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:39:58.119 INFO 12 --- [ main] .s.c.s.e.EurekaInstanceAutoConfiguration : Eureka registration method: route
2019-07-24T02:40:03.023Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [After]
2019-07-24T02:40:03.026Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Before]
2019-07-24T02:40:03.031Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Between]
2019-07-24T02:40:03.036Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Cookie]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Header]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Host]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.020 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Method]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.021 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Path]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.021 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Query]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.021 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [ReadBodyPredicateFactory]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.021 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [RemoteAddr]
2019-07-24T02:40:03.040Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.021 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Weight]
2019-07-24T02:40:03.062Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:03.054 INFO 12 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [CloudFoundryRouteService]
2019-07-24T02:40:12.367Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:12.364 INFO 12 --- [ main] o.s.c.n.eureka.InstanceInfoFactory : Setting initial instance status as: STARTING
2019-07-24T02:40:12.503Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:12.500 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Initializing Eureka in region default
2019-07-24T02:40:13.000Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:13.000 INFO 12 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:40:13.001Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:13.001 INFO 12 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:40:13.045Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:13.030 INFO 12 --- [tificates.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:40:13.561Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:13.560 INFO 12 --- [ main] c.s.FileWatchingX509ExtendedTrustManager : Initialized TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:40:13.808Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:13.807 INFO 12 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON encoding codec LegacyJacksonJson
2019-07-24T02:40:13.808Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:13.808 INFO 12 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON decoding codec LegacyJacksonJson
2019-07-24T02:40:14.302Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:14.301 INFO 12 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML encoding codec XStreamXml
2019-07-24T02:40:14.302Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:14.302 INFO 12 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML decoding codec XStreamXml
2019-07-24T02:40:15.125Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.125 INFO 12 --- [ main] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:40:15.172Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.171 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Disable delta property : false
2019-07-24T02:40:15.172Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.171 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Single vip registry refresh property : null
2019-07-24T02:40:15.174Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.172 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Force full registry fetch : false
2019-07-24T02:40:15.175Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.174 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Application is null : false
2019-07-24T02:40:15.176Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.175 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Registered Applications size is zero : true
2019-07-24T02:40:15.176Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.176 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Application version is -1: true
2019-07-24T02:40:15.176Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.176 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Getting all instance registry info from the eureka server
2019-07-24T02:40:15.337Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.337 INFO 12 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:40:15.342Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.342 INFO 12 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding System Key Manager
2019-07-24T02:40:15.351Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.343 INFO 12 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding Key Manager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T02:40:15.361Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.360 INFO 12 --- [-instance.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.crt
2019-07-24T02:40:15.369Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.369 INFO 12 --- [-instance.key-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.key
2019-07-24T02:40:15.395Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:15.393 INFO 12 --- [ main] o.c.s.FileWatchingX509ExtendedKeyManager : Initialized KeyManager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T02:40:16.725Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.725 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : The response status is 200
2019-07-24T02:40:16.731Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.731 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Starting heartbeat executor: renew interval is: 30
2019-07-24T02:40:16.739Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.739 INFO 12 --- [ main] c.n.discovery.InstanceInfoReplicator : InstanceInfoReplicator onDemand update allowed rate per min is 4
2019-07-24T02:40:16.751Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.751 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Discovery Client initialized at timestamp 1563936016749 with initial instances count: 1
2019-07-24T02:40:16.758Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.757 INFO 12 --- [ main] o.s.c.n.e.s.EurekaServiceRegistry : Registering application PAL-GATEWAY with eureka with status UP
2019-07-24T02:40:16.766Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.765 INFO 12 --- [ main] com.netflix.discovery.DiscoveryClient : Saw local status change event StatusChangeEvent [timestamp=1563936016765, current=UP, previous=STARTING]
2019-07-24T02:40:16.781Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.779 INFO 12 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:cfab4c58-a5ba-4765-61b7-c7fb: registering service...
2019-07-24T02:40:16.996Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:16.996 INFO 12 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:cfab4c58-a5ba-4765-61b7-c7fb - registration status: 204
2019-07-24T02:40:17.440Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:17.440 INFO 12 --- [ main] o.s.b.web.embedded.netty.NettyWebServer : Netty started on port(s): 8080
2019-07-24T02:40:17.448Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:17.448 INFO 12 --- [ main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8080
2019-07-24T02:40:17.451Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:40:17.451 INFO 12 --- [ main] i.p.g.palgateway.PalGatewayApplication : Started PalGatewayApplication in 33.686 seconds (JVM running for 35.359)
2019-07-24T02:40:18.595Z [CELL/0] [OUT] Container became healthy
2019-07-24T02:42:30.577Z [RTR/3] [OUT] poc-gateway-deal-maker.cfapps.io - [2019-07-24T02:42:30.119+0000] "GET / HTTP/1.1" 404 0 269 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" "10.10.2.192:32828" "10.10.148.27:61002" x_forwarded_for:"101.110.32.18, 10.10.2.192" x_forwarded_proto:"https" vcap_request_id:"af1f00e5-c2b8-4d80-5444-a334db699fcf" response_time:0.45807009 app_id:"67ca9100-2b65-43b8-96d2-0196456a9cd5" app_index:"0" x_b3_traceid:"7133d91eb706acd4" x_b3_spanid:"7133d91eb706acd4" x_b3_parentspanid:"-" b3:"7133d91eb706acd4-7133d91eb706acd4"
2019-07-24T02:42:43.998Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:43.997 INFO 12 --- [or-http-epoll-1] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:42:44.564Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:44.564 INFO 12 --- [or-http-epoll-1] c.netflix.config.ChainedDynamicProperty : Flipping property: account-server.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2019-07-24T02:42:44.904Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:44.903 INFO 12 --- [or-http-epoll-1] c.n.u.concurrent.ShutdownEnabledTimer : Shutdown hook installed for: NFLoadBalancer-PingTimer-account-server
2019-07-24T02:42:44.998Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:44.904 INFO 12 --- [or-http-epoll-1] c.netflix.loadbalancer.BaseLoadBalancer : Client: account-server instantiated a LoadBalancer: DynamicServerListLoadBalancer:{NFLoadBalancer:name=account-server,current list of Servers=[],Load balancer stats=Zone stats: {},Server stats: []}ServerList:null
2019-07-24T02:42:45.066Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:45.065 INFO 12 --- [or-http-epoll-1] c.n.l.DynamicServerListLoadBalancer : Using serverListUpdater PollingServerListUpdater
2019-07-24T02:42:46.793Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:46.793 INFO 12 --- [or-http-epoll-1] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:42:46.810Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:46.809 INFO 12 --- [or-http-epoll-1] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:42:46.918Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:42:46.906 INFO 12 --- [or-http-epoll-1] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:42:47.587Z [RTR/4] [OUT] poc-gateway-deal-maker.cfapps.io - [2019-07-24T02:42:43.085+0000] "GET /api/account/guixin HTTP/1.1" 200 0 16 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36" "10.10.2.192:37804" "10.10.148.27:61002" x_forwarded_for:"101.110.32.18, 10.10.2.192" x_forwarded_proto:"https" vcap_request_id:"3dee7d09-8802-4c9e-5152-4a1fe7408db0" response_time:4.502361382 app_id:"67ca9100-2b65-43b8-96d2-0196456a9cd5" app_index:"0" x_b3_traceid:"99a5998f3fb469c3" x_b3_spanid:"99a5998f3fb469c3" x_b3_parentspanid:"-" b3:"99a5998f3fb469c3-99a5998f3fb469c3"
2019-07-24T02:45:15.181Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:45:15.181 INFO 12 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:47:36.608Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:36.608 ERROR 12 --- [tbeatExecutor-0] c.n.d.s.t.d.RedirectingEurekaHttpClient : Request execution error. endpoint=DefaultEndpoint{ serviceUrl='https://eureka-5136457a-e902-4247-ac8d-074b7cbbfe92.cfapps.io/eureka/}
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] org.springframework.security.oauth2.client.resource.OAuth2AccessDeniedException: Error requesting access token.
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.OAuth2AccessTokenSupport.retrieveToken(OAuth2AccessTokenSupport.java:145) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsAccessTokenProvider.obtainAccessToken(ClientCredentialsAccessTokenProvider.java:44) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.AccessTokenProviderChain.obtainNewAccessTokenInternal(AccessTokenProviderChain.java:148) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.AccessTokenProviderChain.obtainAccessToken(AccessTokenProviderChain.java:121) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.OAuth2RestTemplate.acquireAccessToken(OAuth2RestTemplate.java:221) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.OAuth2RestTemplate.getAccessToken(OAuth2RestTemplate.java:173) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at io.pivotal.spring.cloud.service.eureka.EurekaOAuth2RequestDecorator.getHeaders(EurekaOAuth2RequestDecorator.java:52) ~[spring-cloud-services-spring-connector-2.1.3.RELEASE.jar!/:2.1.3.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at io.pivotal.spring.cloud.service.eureka.ClientFilterAdapter.handle(ClientFilterAdapter.java:41) ~[spring-cloud-services-spring-connector-2.1.3.RELEASE.jar!/:2.1.3.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.Client.handle(Client.java:652) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.WebResource.handle(WebResource.java:682) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.WebResource.access$200(WebResource.java:74) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.WebResource$Builder.put(WebResource.java:529) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.sendHeartBeat(AbstractJerseyEurekaHttpClient.java:102) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$3.execute(EurekaHttpClientDecorator.java:92) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.MetricsCollectingEurekaHttpClient.execute(MetricsCollectingEurekaHttpClient.java:73) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.sendHeartBeat(EurekaHttpClientDecorator.java:89) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.execute(RedirectingEurekaHttpClient.java:89) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:120) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.DiscoveryClient.renew(DiscoveryClient.java:864) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.DiscoveryClient$HeartbeatThread.run(DiscoveryClient.java:1423) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.lang.Thread.run(Thread.java:748) [na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] Caused by: org.springframework.web.client.ResourceAccessException: I/O error on POST request for "https://p-spring-cloud-services.uaa.run.pivotal.io/oauth/token": p-spring-cloud-services.uaa.run.pivotal.io; nested exception is java.net.UnknownHostException: p-spring-cloud-services.uaa.run.pivotal.io
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:744) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:691) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.OAuth2AccessTokenSupport.retrieveToken(OAuth2AccessTokenSupport.java:137) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] ... 31 common frames omitted
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] Caused by: java.net.UnknownHostException: p-spring-cloud-services.uaa.run.pivotal.io
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:184) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.security.ssl.SSLSocketImpl.connect(SSLSocketImpl.java:666) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.security.ssl.BaseSSLSocketImpl.connect(BaseSSLSocketImpl.java:173) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.NetworkClient.doConnect(NetworkClient.java:180) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.http.HttpClient.openServer(HttpClient.java:463) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.http.HttpClient.openServer(HttpClient.java:558) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.HttpsClient.<init>(HttpsClient.java:264) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.HttpsClient.New(HttpsClient.java:367) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.getNewHttpClient(AbstractDelegateHttpsURLConnection.java:191) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(HttpURLConnection.java:1162) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:1056) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.connect(AbstractDelegateHttpsURLConnection.java:177) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.HttpsURLConnectionImpl.connect(HttpsURLConnectionImpl.java:167) ~[na:1.8.0_222]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.http.client.SimpleBufferingClientHttpRequest.executeInternal(SimpleBufferingClientHttpRequest.java:76) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.http.client.AbstractBufferingClientHttpRequest.executeInternal(AbstractBufferingClientHttpRequest.java:48) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.http.client.AbstractClientHttpRequest.execute(AbstractClientHttpRequest.java:53) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:735) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] ... 33 common frames omitted
2019-07-24T02:47:36.609Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:36.608 WARN 12 --- [tbeatExecutor-0] c.n.d.s.t.d.RetryableEurekaHttpClient : Request execution failed with message: Error requesting access token.
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:40.610 ERROR 12 --- [freshExecutor-0] c.n.d.s.t.d.RedirectingEurekaHttpClient : Request execution error. endpoint=DefaultEndpoint{ serviceUrl='https://eureka-5136457a-e902-4247-ac8d-074b7cbbfe92.cfapps.io/eureka/}
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] org.springframework.security.oauth2.client.resource.OAuth2AccessDeniedException: Error requesting access token.
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.OAuth2AccessTokenSupport.retrieveToken(OAuth2AccessTokenSupport.java:145) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsAccessTokenProvider.obtainAccessToken(ClientCredentialsAccessTokenProvider.java:44) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.AccessTokenProviderChain.obtainNewAccessTokenInternal(AccessTokenProviderChain.java:148) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.AccessTokenProviderChain.obtainAccessToken(AccessTokenProviderChain.java:121) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.OAuth2RestTemplate.acquireAccessToken(OAuth2RestTemplate.java:221) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.OAuth2RestTemplate.getAccessToken(OAuth2RestTemplate.java:173) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at io.pivotal.spring.cloud.service.eureka.EurekaOAuth2RequestDecorator.getHeaders(EurekaOAuth2RequestDecorator.java:52) ~[spring-cloud-services-spring-connector-2.1.3.RELEASE.jar!/:2.1.3.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at io.pivotal.spring.cloud.service.eureka.ClientFilterAdapter.handle(ClientFilterAdapter.java:41) ~[spring-cloud-services-spring-connector-2.1.3.RELEASE.jar!/:2.1.3.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.Client.handle(Client.java:652) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.WebResource.handle(WebResource.java:682) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.WebResource.access$200(WebResource.java:74) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.sun.jersey.api.client.WebResource$Builder.get(WebResource.java:509) ~[jersey-client-1.19.1.jar!/:1.19.1]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.getApplicationsInternal(AbstractJerseyEurekaHttpClient.java:194) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.getDelta(AbstractJerseyEurekaHttpClient.java:170) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$7.execute(EurekaHttpClientDecorator.java:152) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.MetricsCollectingEurekaHttpClient.execute(MetricsCollectingEurekaHttpClient.java:73) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getDelta(EurekaHttpClientDecorator.java:149) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.execute(RedirectingEurekaHttpClient.java:89) ~[eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:120) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.DiscoveryClient.getAndUpdateDelta(DiscoveryClient.java:1103) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.DiscoveryClient.fetchRegistry(DiscoveryClient.java:985) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.DiscoveryClient.refreshRegistry(DiscoveryClient.java:1497) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at com.netflix.discovery.DiscoveryClient$CacheRefreshThread.run(DiscoveryClient.java:1464) [eureka-client-1.9.12.jar!/:1.9.12]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.lang.Thread.run(Thread.java:748) [na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] Caused by: org.springframework.web.client.ResourceAccessException: I/O error on POST request for "https://p-spring-cloud-services.uaa.run.pivotal.io/oauth/token": p-spring-cloud-services.uaa.run.pivotal.io; nested exception is java.net.UnknownHostException: p-spring-cloud-services.uaa.run.pivotal.io
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:744) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.web.client.RestTemplate.execute(RestTemplate.java:691) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.security.oauth2.client.token.OAuth2AccessTokenSupport.retrieveToken(OAuth2AccessTokenSupport.java:137) ~[spring-security-oauth2-2.3.5.RELEASE.jar!/:na]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] ... 34 common frames omitted
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] Caused by: java.net.UnknownHostException: p-spring-cloud-services.uaa.run.pivotal.io
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:184) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.security.ssl.SSLSocketImpl.connect(SSLSocketImpl.java:666) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.security.ssl.BaseSSLSocketImpl.connect(BaseSSLSocketImpl.java:173) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.NetworkClient.doConnect(NetworkClient.java:180) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.http.HttpClient.openServer(HttpClient.java:463) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.http.HttpClient.openServer(HttpClient.java:558) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.HttpsClient.<init>(HttpsClient.java:264) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.HttpsClient.New(HttpsClient.java:367) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.getNewHttpClient(AbstractDelegateHttpsURLConnection.java:191) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(HttpURLConnection.java:1162) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:1056) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection.connect(AbstractDelegateHttpsURLConnection.java:177) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at sun.net.www.protocol.https.HttpsURLConnectionImpl.connect(HttpsURLConnectionImpl.java:167) ~[na:1.8.0_222]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.http.client.SimpleBufferingClientHttpRequest.executeInternal(SimpleBufferingClientHttpRequest.java:76) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.http.client.AbstractBufferingClientHttpRequest.executeInternal(AbstractBufferingClientHttpRequest.java:48) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.http.client.AbstractClientHttpRequest.execute(AbstractClientHttpRequest.java:53) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] at org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:735) ~[spring-web-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] ... 36 common frames omitted
2019-07-24T02:47:40.611Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:40.610 WARN 12 --- [freshExecutor-0] c.n.d.s.t.d.RetryableEurekaHttpClient : Request execution failed with message: Error requesting access token.
2019-07-24T02:47:41.680Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:41.680 INFO 12 --- [tbeatExecutor-0] c.n.d.s.t.d.RetryableEurekaHttpClient : Request execution succeeded on retry #1
2019-07-24T02:47:41.683Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:41.683 INFO 12 --- [freshExecutor-0] c.n.d.s.t.d.RetryableEurekaHttpClient : Request execution succeeded on retry #1
2019-07-24T02:47:44.852Z [CELL/0] [OUT] Cell 1cc0bd58-b090-49cb-86d1-67c167407ee3 creating container for instance 82d3f0fb-7779-4e28-491f-441e
2019-07-24T02:47:45.566Z [CELL/0] [OUT] Cell 1cc0bd58-b090-49cb-86d1-67c167407ee3 successfully created container for instance 82d3f0fb-7779-4e28-491f-441e
2019-07-24T02:47:45.810Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:47:49.143Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T02:47:49.144Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:47:49.588Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:47:52.828Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:52.823 INFO 29 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:47:52.830Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:52.830 INFO 29 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:47:53.337Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:53.336 INFO 29 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$26557129] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:47:53.607Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:47:53.607Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:47:53.607Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:47:53.607Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:47:53.607Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:47:53.607Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:47:53.609Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:47:53.626Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:53.626 INFO 29 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:47:53.627Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:53.626 INFO 29 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:47:53.629Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:53.629 INFO 29 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:47:55.781Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:55.781 INFO 29 --- [ main] o.s.cloud.context.scope.GenericScope : BeanFactory id=cedea2a3-fe75-3cfb-bf40-fabd407818fa
2019-07-24T02:47:55.788Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:55.788 INFO 29 --- [ main] eReconfigurationBeanFactoryPostProcessor : Skipping reconfiguration because cloud services already configured
2019-07-24T02:47:56.049Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:56.049 INFO 29 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$26557129] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:47:56.716Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:56.715 INFO 29 --- [ main] ctiveUserDetailsServiceAutoConfiguration :
2019-07-24T02:47:56.716Z [APP/PROC/WEB/0] [OUT] Using generated security password: 4b57752d-8123-4041-b184-373d1d4034be
2019-07-24T02:47:56.935Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:56.935 WARN 29 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T02:47:56.936Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:56.935 INFO 29 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2019-07-24T02:47:56.956Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:56.956 WARN 29 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T02:47:56.963Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:56.959 INFO 29 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
2019-07-24T02:47:57.427Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:57.427 INFO 29 --- [ main] .s.c.s.e.EurekaInstanceAutoConfiguration : Eureka registration method: route
2019-07-24T02:47:58.583Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.582 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [After]
2019-07-24T02:47:58.583Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.583 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Before]
2019-07-24T02:47:58.583Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.583 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Between]
2019-07-24T02:47:58.585Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.583 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Cookie]
2019-07-24T02:47:58.586Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.585 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Header]
2019-07-24T02:47:58.586Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.586 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Host]
2019-07-24T02:47:58.587Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.586 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Method]
2019-07-24T02:47:58.587Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.587 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Path]
2019-07-24T02:47:58.587Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.587 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Query]
2019-07-24T02:47:58.588Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.587 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [ReadBodyPredicateFactory]
2019-07-24T02:47:58.588Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.588 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [RemoteAddr]
2019-07-24T02:47:58.588Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.588 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [Weight]
2019-07-24T02:47:58.588Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:58.588 INFO 29 --- [ main] o.s.c.g.r.RouteDefinitionRouteLocator : Loaded RoutePredicateFactory [CloudFoundryRouteService]
2019-07-24T02:47:59.664Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:59.664 INFO 29 --- [ main] o.s.c.n.eureka.InstanceInfoFactory : Setting initial instance status as: STARTING
2019-07-24T02:47:59.731Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:59.729 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Initializing Eureka in region default
2019-07-24T02:47:59.907Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:59.906 INFO 29 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:47:59.907Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:59.907 INFO 29 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:47:59.918Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:47:59.918 INFO 29 --- [tificates.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:48:00.076Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.076 INFO 29 --- [ main] c.s.FileWatchingX509ExtendedTrustManager : Initialized TrustManager for /etc/ssl/certs/ca-certificates.crt
2019-07-24T02:48:00.171Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.171 INFO 29 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON encoding codec LegacyJacksonJson
2019-07-24T02:48:00.171Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.171 INFO 29 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using JSON decoding codec LegacyJacksonJson
2019-07-24T02:48:00.452Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.451 INFO 29 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML encoding codec XStreamXml
2019-07-24T02:48:00.452Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.452 INFO 29 --- [ main] c.n.d.provider.DiscoveryJerseyProvider : Using XML decoding codec XStreamXml
2019-07-24T02:48:00.751Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.750 INFO 29 --- [ main] c.n.d.s.r.aws.ConfigClusterResolver : Resolving eureka endpoints via configuration
2019-07-24T02:48:00.781Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.781 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Disable delta property : false
2019-07-24T02:48:00.781Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.781 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Single vip registry refresh property : null
2019-07-24T02:48:00.781Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.781 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Force full registry fetch : false
2019-07-24T02:48:00.782Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.781 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Application is null : false
2019-07-24T02:48:00.782Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.781 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Registered Applications size is zero : true
2019-07-24T02:48:00.782Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.782 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Application version is -1: true
2019-07-24T02:48:00.782Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.782 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Getting all instance registry info from the eureka server
2019-07-24T02:48:00.864Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.864 INFO 29 --- [ main] ContainerTrustManagerFactory$PKIXFactory : Adding System Trust Manager
2019-07-24T02:48:00.868Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.868 INFO 29 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding System Key Manager
2019-07-24T02:48:00.868Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.868 INFO 29 --- [ main] oundryContainerKeyManagerFactory$SunX509 : Adding Key Manager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T02:48:00.875Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.875 INFO 29 --- [-instance.crt-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.crt
2019-07-24T02:48:00.882Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.882 INFO 29 --- [-instance.key-0] org.cloudfoundry.security.FileWatcher : Start watching /etc/cf-instance-credentials/instance.key
2019-07-24T02:48:00.891Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:00.891 INFO 29 --- [ main] o.c.s.FileWatchingX509ExtendedKeyManager : Initialized KeyManager for /etc/cf-instance-credentials/instance.key and /etc/cf-instance-credentials/instance.crt
2019-07-24T02:48:01.557Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.556 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : The response status is 200
2019-07-24T02:48:01.569Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.569 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Starting heartbeat executor: renew interval is: 30
2019-07-24T02:48:01.575Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.575 INFO 29 --- [ main] c.n.discovery.InstanceInfoReplicator : InstanceInfoReplicator onDemand update allowed rate per min is 4
2019-07-24T02:48:01.583Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.582 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Discovery Client initialized at timestamp 1563936481581 with initial instances count: 2
2019-07-24T02:48:01.585Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.585 INFO 29 --- [ main] o.s.c.n.e.s.EurekaServiceRegistry : Registering application PAL-GATEWAY with eureka with status UP
2019-07-24T02:48:01.586Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.586 INFO 29 --- [ main] com.netflix.discovery.DiscoveryClient : Saw local status change event StatusChangeEvent [timestamp=1563936481586, current=UP, previous=STARTING]
2019-07-24T02:48:01.593Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.592 INFO 29 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:82d3f0fb-7779-4e28-491f-441e: registering service...
2019-07-24T02:48:01.718Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.717 INFO 29 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:82d3f0fb-7779-4e28-491f-441e - registration status: 204
2019-07-24T02:48:01.977Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.976 INFO 29 --- [ main] o.s.b.web.embedded.netty.NettyWebServer : Netty started on port(s): 8080
2019-07-24T02:48:01.978Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.977 INFO 29 --- [ main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8080
2019-07-24T02:48:01.981Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:01.981 INFO 29 --- [ main] i.p.g.palgateway.PalGatewayApplication : Started PalGatewayApplication in 10.989 seconds (JVM running for 12.388)
2019-07-24T02:48:03.806Z [CELL/0] [OUT] Container became healthy
2019-07-24T02:48:24.079Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c stopping instance cfab4c58-a5ba-4765-61b7-c7fb
2019-07-24T02:48:29.295Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:48:29.296Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.296 INFO 12 --- [ Thread-20] c.n.l.PollingServerListUpdater : Shutting down the Executor Pool for PollingServerListUpdater
2019-07-24T02:48:29.297Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.296 INFO 12 --- [ Thread-13] o.s.c.n.e.s.EurekaServiceRegistry : Unregistering application PAL-GATEWAY with eureka with status DOWN
2019-07-24T02:48:29.297Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.297 WARN 12 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Saw local status change event StatusChangeEvent [timestamp=1563936509297, current=DOWN, previous=UP]
2019-07-24T02:48:29.297Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.297 INFO 12 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:cfab4c58-a5ba-4765-61b7-c7fb: registering service...
2019-07-24T02:48:29.320Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.319 INFO 12 --- [ Thread-13] c.n.u.concurrent.ShutdownEnabledTimer : Shutdown hook removed for: NFLoadBalancer-PingTimer-account-server
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.320 INFO 12 --- [ Thread-13] c.n.u.concurrent.ShutdownEnabledTimer : Exception caught (might be ok if at shutdown)
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] java.lang.IllegalStateException: Shutdown in progress
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at java.lang.ApplicationShutdownHooks.remove(ApplicationShutdownHooks.java:82) ~[na:1.8.0_222]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at java.lang.Runtime.removeShutdownHook(Runtime.java:239) ~[na:1.8.0_222]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at com.netflix.util.concurrent.ShutdownEnabledTimer.cancel(ShutdownEnabledTimer.java:70) ~[netflix-commons-util-0.3.0.jar!/:0.3.0]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at com.netflix.loadbalancer.BaseLoadBalancer.cancelPingTask(BaseLoadBalancer.java:632) [ribbon-loadbalancer-2.3.0.jar!/:2.3.0]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at com.netflix.loadbalancer.BaseLoadBalancer.shutdown(BaseLoadBalancer.java:883) [ribbon-loadbalancer-2.3.0.jar!/:2.3.0]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at com.netflix.loadbalancer.DynamicServerListLoadBalancer.shutdown(DynamicServerListLoadBalancer.java:285) [ribbon-loadbalancer-2.3.0.jar!/:2.3.0]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_222]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_222]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_222]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_222]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DisposableBeanAdapter.invokeCustomDestroyMethod(DisposableBeanAdapter.java:339) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DisposableBeanAdapter.destroy(DisposableBeanAdapter.java:273) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroyBean(DefaultSingletonBeanRegistry.java:571) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingleton(DefaultSingletonBeanRegistry.java:543) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingleton(DefaultListableBeanFactory.java:1036) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.destroySingletons(DefaultSingletonBeanRegistry.java:504) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DefaultListableBeanFactory.destroySingletons(DefaultListableBeanFactory.java:1029) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext.destroyBeans(AbstractApplicationContext.java:1057) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext.doClose(AbstractApplicationContext.java:1026) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext.close(AbstractApplicationContext.java:975) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.cloud.context.named.NamedContextFactory.destroy(NamedContextFactory.java:92) [spring-cloud-context-2.1.2.RELEASE.jar!/:2.1.2.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.beans.factory.support.DisposableBeanAdapter.destroy(DisposableBeanAdapter.java:258) [spring-beans-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.323Z [APP/PROC/WEB/0] [OUT] at org.springframework.context.support.AbstractApplicationContext$1.run(AbstractApplicationContext.java:945) [spring-context-5.1.8.RELEASE.jar!/:5.1.8.RELEASE]
2019-07-24T02:48:29.355Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.355 INFO 12 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Shutting down DiscoveryClient ...
2019-07-24T02:48:29.374Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.366 INFO 12 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:cfab4c58-a5ba-4765-61b7-c7fb - registration status: 204
2019-07-24T02:48:29.374Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.367 INFO 12 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Unregistering ...
2019-07-24T02:48:29.416Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.416 INFO 12 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:cfab4c58-a5ba-4765-61b7-c7fb - deregister status: 200
2019-07-24T02:48:29.446Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:48:29.445 INFO 12 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Completed shut down of DiscoveryClient
2019-07-24T02:48:29.874Z [APP/PROC/WEB/0] [OUT] Exit status 143
2019-07-24T02:48:30.436Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c destroying container for instance cfab4c58-a5ba-4765-61b7-c7fb
2019-07-24T02:48:30.758Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:48:31.074Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully destroyed container for instance cfab4c58-a5ba-4765-61b7-c7fb
2019-07-24T02:49:56.634Z [API/16] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"buildpack"=>"", "disk_quota"=>1024, "health_check_http_endpoint"=>"", "health_check_type"=>"port", "instances"=>1, "memory"=>1024, "name"=>"poc-gateway", "space_guid"=>"9aa73bae-0679-422c-b25b-2ad2780c435c"})
2019-07-24T02:50:02.153Z [API/13] [OUT] Uploading bits for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:50:19.919Z [CELL/0] [OUT] Cell 1cc0bd58-b090-49cb-86d1-67c167407ee3 stopping instance 82d3f0fb-7779-4e28-491f-441e
2019-07-24T02:50:19.924Z [API/12] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STOPPED"})
2019-07-24T02:50:20.426Z [API/9] [OUT] Creating build for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:50:21.308Z [API/9] [OUT] Updated app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5 ({"state"=>"STARTED"})
2019-07-24T02:50:21.440Z [STG/0] [OUT] Downloading dotnet_core_buildpack_beta...
2019-07-24T02:50:21.441Z [STG/0] [OUT] Downloading python_buildpack...
2019-07-24T02:50:21.441Z [STG/0] [OUT] Downloading nodejs_buildpack...
2019-07-24T02:50:21.441Z [STG/0] [OUT] Downloading go_buildpack...
2019-07-24T02:50:21.463Z [STG/0] [OUT] Downloading php_buildpack...
2019-07-24T02:50:21.518Z [STG/0] [OUT] Downloaded go_buildpack
2019-07-24T02:50:21.518Z [STG/0] [OUT] Downloading binary_buildpack...
2019-07-24T02:50:21.546Z [STG/0] [OUT] Downloaded binary_buildpack
2019-07-24T02:50:21.547Z [STG/0] [OUT] Downloading java_buildpack...
2019-07-24T02:50:21.585Z [STG/0] [OUT] Downloaded java_buildpack
2019-07-24T02:50:21.585Z [STG/0] [OUT] Downloading ruby_buildpack...
2019-07-24T02:50:21.612Z [STG/0] [OUT] Downloaded ruby_buildpack
2019-07-24T02:50:21.613Z [STG/0] [OUT] Downloading staticfile_buildpack...
2019-07-24T02:50:22.743Z [STG/0] [OUT] Downloaded staticfile_buildpack (9.5M)
2019-07-24T02:50:22.743Z [STG/0] [OUT] Downloading dotnet_core_buildpack...
2019-07-24T02:50:24.026Z [STG/0] [OUT] Downloaded dotnet_core_buildpack_beta (99.4M)
2019-07-24T02:50:25.055Z [CELL/SSHD/0] [OUT] Exit status 0
2019-07-24T02:50:25.057Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:25.056 INFO 29 --- [ Thread-13] o.s.c.n.e.s.EurekaServiceRegistry : Unregistering application PAL-GATEWAY with eureka with status DOWN
2019-07-24T02:50:25.058Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:25.057 WARN 29 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Saw local status change event StatusChangeEvent [timestamp=1563936625057, current=DOWN, previous=UP]
2019-07-24T02:50:25.059Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:25.058 INFO 29 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:82d3f0fb-7779-4e28-491f-441e: registering service...
2019-07-24T02:50:25.103Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:25.103 INFO 29 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:82d3f0fb-7779-4e28-491f-441e - registration status: 204
2019-07-24T02:50:25.135Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:25.134 INFO 29 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Shutting down DiscoveryClient ...
2019-07-24T02:50:26.958Z [STG/0] [OUT] Downloaded nodejs_buildpack (121.6M)
2019-07-24T02:50:28.137Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:28.136 INFO 29 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Unregistering ...
2019-07-24T02:50:28.181Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:28.181 INFO 29 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : DiscoveryClient_PAL-GATEWAY/poc-gateway-deal-maker.cfapps.io:82d3f0fb-7779-4e28-491f-441e - deregister status: 200
2019-07-24T02:50:28.196Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:50:28.196 INFO 29 --- [ Thread-13] com.netflix.discovery.DiscoveryClient : Completed shut down of DiscoveryClient
2019-07-24T02:50:28.602Z [APP/PROC/WEB/0] [OUT] Exit status 143
2019-07-24T02:50:28.689Z [CELL/0] [OUT] Cell 1cc0bd58-b090-49cb-86d1-67c167407ee3 destroying container for instance 82d3f0fb-7779-4e28-491f-441e
2019-07-24T02:50:28.905Z [PROXY/0] [OUT] Exit status 137
2019-07-24T02:50:29.227Z [CELL/0] [OUT] Cell 1cc0bd58-b090-49cb-86d1-67c167407ee3 successfully destroyed container for instance 82d3f0fb-7779-4e28-491f-441e
2019-07-24T02:50:57.051Z [STG/0] [OUT] Downloaded python_buildpack (563.7M)
2019-07-24T02:51:01.635Z [STG/0] [OUT] Downloaded dotnet_core_buildpack (873.9M)
2019-07-24T02:51:10.032Z [STG/0] [OUT] Downloaded php_buildpack (520.7M)
2019-07-24T02:51:10.032Z [STG/0] [OUT] Cell 6e291b09-83d3-4f03-8c24-650d346dd756 creating container for instance 13537fe7-acc9-42ea-a502-37b8688cedcc
2019-07-24T02:51:10.632Z [STG/0] [OUT] Cell 6e291b09-83d3-4f03-8c24-650d346dd756 successfully created container for instance 13537fe7-acc9-42ea-a502-37b8688cedcc
2019-07-24T02:51:10.831Z [STG/0] [OUT] Downloading app package...
2019-07-24T02:51:10.831Z [STG/0] [OUT] Downloading build artifacts cache...
2019-07-24T02:51:10.849Z [STG/0] [ERR] Downloading build artifacts cache failed
2019-07-24T02:51:12.362Z [STG/0] [OUT] Downloaded app package (40.2M)
2019-07-24T02:51:15.450Z [STG/0] [OUT] [1m[31m----->[0m[22m [1m[34mJava Buildpack[0m[22m [34mv4.20[0m [34m(offline)[0m | https://github.com/cloudfoundry/java-buildpack.git#2cd7e3e
2019-07-24T02:51:15.512Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mJvmkill Agent[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so [3m[32m(found in cache)[0m[23m
2019-07-24T02:51:15.515Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen Jdk JRE[0m[22m [34m1.8.0_222[0m from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/openjdk-jre-1.8.0_222-bionic.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T02:51:16.711Z [STG/0] [OUT] Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre [3m[32m(1.1s)[0m[23m
2019-07-24T02:51:16.711Z [STG/0] [OUT] JVM DNS caching disabled in lieu of BOSH DNS caching
2019-07-24T02:51:16.712Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mOpen JDK Like Memory Calculator[0m[22m [34m3.13.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz [3m[32m(found in cache)[0m[23m
2019-07-24T02:51:18.376Z [STG/0] [OUT] Loaded Classes: 18985, Threads: 250
2019-07-24T02:51:18.406Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mClient Certificate Mapper[0m[22m [34m1.8.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.8.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:51:18.407Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mContainer Security Provider[0m[22m [34m1.16.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.16.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:51:18.408Z [STG/0] [OUT] [1m[31m----->[0m[22m Downloading [1m[34mSpring Auto Reconfiguration[0m[22m [34m2.7.0_RELEASE[0m from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.7.0-RELEASE.jar [3m[32m(found in cache)[0m[23m
2019-07-24T02:51:29.455Z [STG/0] [OUT] Exit status 0
2019-07-24T02:51:29.455Z [STG/0] [OUT] Uploading droplet, build artifacts cache...
2019-07-24T02:51:29.455Z [STG/0] [OUT] Uploading droplet...
2019-07-24T02:51:29.455Z [STG/0] [OUT] Uploading build artifacts cache...
2019-07-24T02:51:29.588Z [STG/0] [OUT] Uploaded build artifacts cache (128B)
2019-07-24T02:51:30.541Z [API/4] [OUT] Creating droplet for app with guid 67ca9100-2b65-43b8-96d2-0196456a9cd5
2019-07-24T02:51:34.786Z [STG/0] [OUT] Uploaded droplet (83.7M)
2019-07-24T02:51:34.803Z [STG/0] [OUT] Uploading complete
2019-07-24T02:51:34.967Z [STG/0] [OUT] Cell 6e291b09-83d3-4f03-8c24-650d346dd756 stopping instance 13537fe7-acc9-42ea-a502-37b8688cedcc
2019-07-24T02:51:34.967Z [STG/0] [OUT] Cell 6e291b09-83d3-4f03-8c24-650d346dd756 destroying container for instance 13537fe7-acc9-42ea-a502-37b8688cedcc
2019-07-24T02:51:35.400Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c creating container for instance aafa94e7-1142-4507-4120-200a
2019-07-24T02:51:35.900Z [CELL/0] [OUT] Cell 2440170a-656c-492a-82e8-da4cdbd1373c successfully created container for instance aafa94e7-1142-4507-4120-200a
2019-07-24T02:51:36.018Z [CELL/0] [OUT] Downloading droplet...
2019-07-24T02:51:37.816Z [STG/0] [OUT] Cell 6e291b09-83d3-4f03-8c24-650d346dd756 successfully destroyed container for instance 13537fe7-acc9-42ea-a502-37b8688cedcc
2019-07-24T02:51:39.498Z [CELL/0] [OUT] Downloaded droplet (83.7M)
2019-07-24T02:51:39.498Z [CELL/0] [OUT] Starting health monitoring of container
2019-07-24T02:51:40.024Z [APP/PROC/WEB/0] [OUT] JVM Memory Configuration: -Xmx408008K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=128567K
2019-07-24T02:51:43.967Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:43.962 INFO 35 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:51:43.969Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:43.969 INFO 35 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:51:44.542Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:44.542 INFO 35 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$1e9646aa] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:51:44.872Z [APP/PROC/WEB/0] [OUT] . ____ _ __ _ _
2019-07-24T02:51:44.873Z [APP/PROC/WEB/0] [OUT] /\\ / ___'_ __ _ _(_)_ __ __ _ \ \ \ \
2019-07-24T02:51:44.873Z [APP/PROC/WEB/0] [OUT] ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2019-07-24T02:51:44.873Z [APP/PROC/WEB/0] [OUT] \\/ ___)| |_)| | | | | || (_| | ) ) ) )
2019-07-24T02:51:44.873Z [APP/PROC/WEB/0] [OUT] ' |____| .__|_| |_|_| |_\__, | / / / /
2019-07-24T02:51:44.873Z [APP/PROC/WEB/0] [OUT] =========|_|==============|___/=/_/_/_/
2019-07-24T02:51:44.874Z [APP/PROC/WEB/0] [OUT] :: Spring Boot :: (v2.1.6.RELEASE)
2019-07-24T02:51:44.923Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:44.923 INFO 35 --- [ main] pertySourceApplicationContextInitializer : 'cloud' property source added
2019-07-24T02:51:44.923Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:44.923 INFO 35 --- [ main] nfigurationApplicationContextInitializer : Reconfiguration enabled
2019-07-24T02:51:44.937Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:44.937 INFO 35 --- [ main] i.p.g.palgateway.PalGatewayApplication : The following profiles are active: cloud
2019-07-24T02:51:47.030Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:47.030 INFO 35 --- [ main] o.s.cloud.context.scope.GenericScope : BeanFactory id=40dd50af-4842-3c76-99bb-6e08f0307a1b
2019-07-24T02:51:47.037Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:47.036 INFO 35 --- [ main] eReconfigurationBeanFactoryPostProcessor : Skipping reconfiguration because cloud services already configured
2019-07-24T02:51:47.255Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:47.254 INFO 35 --- [ main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$1e9646aa] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24T02:51:47.811Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:47.811 INFO 35 --- [ main] ctiveUserDetailsServiceAutoConfiguration :
2019-07-24T02:51:47.811Z [APP/PROC/WEB/0] [OUT] Using generated security password: 6cc144c0-2612-4bec-abd5-8c37ffad4093
2019-07-24T02:51:48.036Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:48.035 WARN 35 --- [ main] c.n.c.sources.URLConfigurationSource : No URLs will be polled as dynamic configuration sources.
2019-07-24T02:51:48.036Z [APP/PROC/WEB/0] [OUT] 2019-07-24 02:51:48.036 INFO 35 --- [ main] c.n.c.sources.URLConfigurationSource : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.```