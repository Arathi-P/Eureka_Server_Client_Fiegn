package com.demo.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientControllerImpl {
    @Autowired
    private EurekaClientController eurekaClientController;

    @GetMapping("/callServiceA")
    public String callServiceA() {
        return eurekaClientController.callServiceA();
    }

}
