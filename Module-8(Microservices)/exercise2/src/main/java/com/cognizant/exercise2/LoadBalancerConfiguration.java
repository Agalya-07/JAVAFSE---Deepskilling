package com.cognizant.exercise2;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {

    public LoadBalancerConfiguration() {
        System.out.println("Spring Cloud LoadBalancer Configuration Loaded...");
    }

}