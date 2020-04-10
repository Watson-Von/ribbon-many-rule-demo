package com.user.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserThreeApplication.class, args);
    }

}
