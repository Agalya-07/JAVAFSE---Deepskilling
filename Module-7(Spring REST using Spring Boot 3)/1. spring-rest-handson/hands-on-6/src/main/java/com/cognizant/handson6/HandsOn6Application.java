package com.cognizant.handson6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HandsOn6Application {

    public static void main(String[] args) {

        SpringApplication.run(HandsOn6Application.class, args);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        CountryService service =
                context.getBean("countryService", CountryService.class);

        System.out.println(service.getCountry());

        ((ClassPathXmlApplicationContext) context).close();
    }
}