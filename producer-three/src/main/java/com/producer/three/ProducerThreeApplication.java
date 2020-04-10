package com.producer.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerThreeApplication.class, args);
    }

}
