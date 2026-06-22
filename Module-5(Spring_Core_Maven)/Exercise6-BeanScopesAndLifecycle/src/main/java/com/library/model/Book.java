package com.library.model;

public class Book {

    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void init() {
        System.out.println("Bean Initialized");
    }

    public void destroy() {
        System.out.println("Bean Destroyed");
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName;
    }
}