package com.producer.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/getProduct")
    public String getProduct() {
        return "producer:8003提供";
    }

}
