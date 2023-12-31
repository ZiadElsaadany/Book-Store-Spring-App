package com.trainig.BookStore.repository;

import com.trainig.BookStore.entity.Book;
import com.trainig.BookStore.exception.BookNotFoundException;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;


@Repository
public class BookStoreRepository {

    private  final List<Book> bookList = new ArrayList<>( );

     // return book by id
    // 3 ways
    // 1   optional way not found

    // way 2
    public  Book getBookById( Integer id)  {

        return  bookList.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);

    }
    public  Book getBookByIdV2( Integer id)  throws  BookNotFoundException  {

        return  bookList.stream().filter(book -> book.getId().equals(id)).findFirst().orElseThrow(()->new BookNotFoundException("Book Not Found"));

    }

    public  Book addBook(Book  book ) {
        // add method  -->   true and false
       return  this.bookList.add(book)?   book :null;
    }
    public  Book updateBook(Book  book  , Integer id) throws  BookNotFoundException{
        // add method  -->   true and false

Book  book2= getBookByIdV2(id) ;
this.bookList.remove(book2);
return  this.addBook(book) ;

    }


    public  boolean deleteBookById( Integer id   )  throws    BookNotFoundException {
     Book book =   getBookByIdV2(id);
   return   this.bookList.remove(book);
    }
    public  List<Book> getAllBooks( ) {

   return   this.bookList;
    }


}
