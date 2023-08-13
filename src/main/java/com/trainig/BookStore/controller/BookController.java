package com.trainig.BookStore.controller;

import com.trainig.BookStore.entity.Book;
import com.trainig.BookStore.exception.BookNotFoundException;
import com.trainig.BookStore.services.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
@RestController
@AllArgsConstructor
public class BookController {

    private  final IBookService bookService ;


    // Get All Books
    @GetMapping("/")

   public List<Book> getAllBooks()  {
       return this.bookService.getAllBooks() ;
    }

    //localhost:8080/book/1/
    @GetMapping("/{id}")

    /**PathVariable  --> */
   public Book getBookById(@PathVariable("id") Integer id)   throws BookNotFoundException {
       return this.bookService.getBookByIdV2(id) ;
    }
    @DeleteMapping("/{id}")
   public boolean deleteById(@PathVariable("id") Integer id)   throws BookNotFoundException {
       return this.bookService.deleteBookById(id) ;
    }
    @PostMapping("/")
   public Book addBook(@RequestBody  Book book){
       return this.bookService.addBook(book) ;
    }
    @PutMapping("/{id}")
   public Book updateBook(@RequestBody  Book book,@PathVariable("id") Integer id) throws  BookNotFoundException{
       return this.bookService.updateBook(book,id) ;
    }


}
