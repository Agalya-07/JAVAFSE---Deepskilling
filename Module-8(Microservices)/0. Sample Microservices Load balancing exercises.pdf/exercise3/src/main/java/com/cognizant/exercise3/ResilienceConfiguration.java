package com.cognizant.exercise3;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ResilienceConfiguration {

    public ResilienceConfiguration() {
        System.out.println("Resilience Configuration Loaded...");
    }

}