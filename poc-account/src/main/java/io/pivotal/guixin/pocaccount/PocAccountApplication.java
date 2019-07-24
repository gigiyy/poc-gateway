package io.pivotal.guixin.pocaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PocAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocAccountApplication.class, args);
    }

}
