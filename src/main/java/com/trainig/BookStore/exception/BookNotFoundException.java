package com.trainig.BookStore.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String bookNotFound) {
        // implement when exception
        System.out.println(bookNotFound);
    }
}
