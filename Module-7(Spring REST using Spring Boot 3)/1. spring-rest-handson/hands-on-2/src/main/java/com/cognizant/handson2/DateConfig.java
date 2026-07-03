package com.cognizant.handson2;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateConfig {

    @Bean
    public SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("dd/MM/yyyy");
    }
}