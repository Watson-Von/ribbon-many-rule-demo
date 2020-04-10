package com.consumer.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user")
public interface UserClient {

    @GetMapping("/user/user/getUser")
    String getUser();

}
