package com.cognizant.handson5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HandsOn5Application {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HandsOn5Application.class);

    public static void main(String[] args) {

        SpringApplication.run(HandsOn5Application.class, args);

        displayCountry();
    }

    public static void displayCountry() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country1 = context.getBean("country", Country.class);
        Country country2 = context.getBean("country", Country.class);

        LOGGER.debug("Singleton Scope");
        LOGGER.debug("Country 1 : {}", country1);
        LOGGER.debug("Country 2 : {}", country2);
        LOGGER.debug("Same Object : {}", country1 == country2);

        Country prototype1 = context.getBean("countryPrototype", Country.class);
        Country prototype2 = context.getBean("countryPrototype", Country.class);

        LOGGER.debug("Prototype Scope");
        LOGGER.debug("Country 1 : {}", prototype1);
        LOGGER.debug("Country 2 : {}", prototype2);
        LOGGER.debug("Same Object : {}", prototype1 == prototype2);

        ((ClassPathXmlApplicationContext) context).close();

        LOGGER.info("END");
    }
}