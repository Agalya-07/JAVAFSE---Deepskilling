package com.cognizant.microservicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    @GetMapping("/bill")
    public String getBill() {
        return "Billing Service Running Successfully!";
    }
}