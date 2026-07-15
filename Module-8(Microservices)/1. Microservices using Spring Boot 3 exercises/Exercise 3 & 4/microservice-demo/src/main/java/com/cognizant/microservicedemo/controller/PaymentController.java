package com.cognizant.microservicedemo.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/pay")
    @CircuitBreaker(name="paymentService", fallbackMethod="paymentFallback")
    public String payment() {
        throw new RuntimeException("Third Party API is Down");
    }

    public String paymentFallback(Exception ex) {
        return "Payment Service is temporarily unavailable. Please try again later.";
    }
}