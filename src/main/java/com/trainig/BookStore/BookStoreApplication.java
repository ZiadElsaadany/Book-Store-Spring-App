package com.trainig.BookStore;

import com.trainig.BookStore.entity.Book;
import com.trainig.BookStore.services.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreApplication implements CommandLineRunner {

	/**	private final BookService  bookService ;*/
	private final IBookService bookService ;

	public static void main(String[] args)  {


		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		IntStream.range(1,1000).mapToObj(x->new Book("","","",x,Float.valueOf(20))).forEach( this.bookService::addBook);

	}
}
