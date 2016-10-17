package com.synertrade.training.trainingapp.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tudorg on 10/17/2016.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
