package com.cognizant.handson2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HandsOn2Application {

    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                SpringApplication.run(HandsOn2Application.class, args);

        SimpleDateFormat sdf = context.getBean(SimpleDateFormat.class);

        Date date = sdf.parse("31/12/2018");

        System.out.println(date);
    }
}