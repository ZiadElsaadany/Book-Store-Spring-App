package com.trainig.BookStore.services;

import com.trainig.BookStore.entity.Book;
import com.trainig.BookStore.exception.BookNotFoundException;

import java.util.List;

public interface IBookService{
    // add methods that create on repository

    Book getBookByIdV2( Integer id) throws  BookNotFoundException;
    Book addBook(Book book ) ;
    Book updateBook(Book book ,Integer id ) throws  BookNotFoundException;
    boolean deleteBookById( Integer id   ) throws BookNotFoundException;
    List<Book> getAllBooks(  ) ;

}
