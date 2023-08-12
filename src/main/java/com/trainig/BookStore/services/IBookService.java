package com.trainig.BookStore.services;

import com.trainig.BookStore.entity.Book;
import com.trainig.BookStore.exception.BookNotFoundException;

public interface IBookService{
    // add methods that create on repository

    Book getBookByIdV2( Integer id) throws  BookNotFoundException;
    Book addBook(Book book ) ;
    boolean deleteBookById( Integer id   ) throws BookNotFoundException;

}
