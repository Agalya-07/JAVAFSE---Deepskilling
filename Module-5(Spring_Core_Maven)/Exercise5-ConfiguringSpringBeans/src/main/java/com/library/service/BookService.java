package com.library.service;

import com.library.model.Book;

public class BookService {

    private Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    public void displayBook() {
        System.out.println(book);
    }
}