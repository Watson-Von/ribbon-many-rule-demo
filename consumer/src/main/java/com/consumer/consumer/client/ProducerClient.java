package com.consumer.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer")
public interface ProducerClient {

    @GetMapping("/producer/product/getProduct")
    String getProduct();

}
