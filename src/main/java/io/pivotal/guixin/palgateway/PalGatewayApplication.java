package io.pivotal.guixin.palgateway;

import io.pivotal.spring.cloud.service.eureka.EurekaInstanceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = {EurekaInstanceAutoConfiguration.class})
public class PalGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalGatewayApplication.class, args);
    }

}
