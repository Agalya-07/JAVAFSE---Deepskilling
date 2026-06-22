package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.model.Book;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Book book1 = (Book) context.getBean("book");
        Book book2 = (Book) context.getBean("book");

        System.out.println(book1);
        System.out.println(book2);

        context.close();
    }
}