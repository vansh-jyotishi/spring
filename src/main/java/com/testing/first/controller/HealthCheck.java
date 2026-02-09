package com.testing.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-check")
    public int healthcheck(int a,int b){
        int sum = a+b;
        return sum ;
    }
}
