package com.demo.eurekaClient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceA")
public interface EurekaClientController {

    @GetMapping("/service/one")
    String callServiceA();
}


