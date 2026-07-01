package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cognizant")
@EnableJpaRepositories(basePackages = "com.cognizant.repository")
@EntityScan(basePackages = "com.cognizant.entity")
public class OrmLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

}