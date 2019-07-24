package io.pivotal.guixin.palgateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PalGatewayController {

    @Value("${pal.url}")
    String palUrl;

    @Bean
    public RouteLocator palGateway(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/api/account/{name}")
                        .filters(f -> f.rewritePath("/api/account/(?<name>[a-z]+)", "/accounts?name=${name}"))
                        .uri(palUrl))
                .build();
    }
}
