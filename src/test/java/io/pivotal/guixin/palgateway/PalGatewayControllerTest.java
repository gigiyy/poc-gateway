package io.pivotal.guixin.palgateway;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.time.Duration;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

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
        webTestClient.get().uri("/api/account/guixin")
                .exchange().expectStatus().isOk().expectBody().jsonPath("$.result", "account");

    }
}
