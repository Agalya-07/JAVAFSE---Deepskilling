package com.slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLoggingExample {
    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);
    public static void main(String[] args) {
        String user = "Agalya";
        int age = 20;
        logger.info("User name: {}", user);
        logger.info("User age: {}", age);
        logger.warn("This is a warning message for user: {}", user);
        logger.error("Error occurred for user: {}", user);
    }
}