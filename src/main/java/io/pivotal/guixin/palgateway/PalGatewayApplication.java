package io.pivotal.guixin.palgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;

@EnableEurekaClient
@SpringBootApplication(exclude = {EurekaClientAutoConfiguration.class})
public class PalGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalGatewayApplication.class, args);
    }

}
