package com.salloz.candy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandyController {
    @GetMapping("/hola")
    public String hello() {
        return "hello";
    }
}
