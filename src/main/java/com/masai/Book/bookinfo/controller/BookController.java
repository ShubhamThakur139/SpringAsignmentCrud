package com.masai.Book.bookinfo.controller;

import com.masai.Book.bookinfo.entity.Book;
import com.masai.Book.bookinfo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") String bookId){
        Book book = bookService.getBook(bookId);
        return book;
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        Book book1 = bookService.addBook(book);
        return book1;
    }

    @PutMapping("/book")
    public String updateBook(@RequestBody Book book){
        String msg = bookService.updateBook(book);
        return msg;
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") String bookId){
        String msg = bookService.deleteBook(bookId);
        return msg;
    }

}
