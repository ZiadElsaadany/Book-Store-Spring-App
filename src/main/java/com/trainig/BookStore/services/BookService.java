package com.trainig.BookStore.services;

import com.trainig.BookStore.entity.Book;
import com.trainig.BookStore.exception.BookNotFoundException;
import com.trainig.BookStore.repository.BookStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {

    private final BookStoreRepository bookStoreRepository ;
    @Override
    public Book getBookByIdV2(Integer id) throws  BookNotFoundException{
        return bookStoreRepository.getBookByIdV2(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookStoreRepository.addBook(book);
    }

    @Override
    public boolean deleteBookById(Integer id) throws BookNotFoundException {
        return bookStoreRepository.deleteBookById(id);
    }
}
