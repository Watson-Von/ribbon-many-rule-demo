package com.user.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserOneApplication.class, args);
    }

}
