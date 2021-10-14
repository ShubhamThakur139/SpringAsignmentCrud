package com.masai.Book.bookinfo.service;

import com.masai.Book.bookinfo.entity.Book;
import com.masai.Book.bookinfo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public Book addBook(Book book) {
        Book book1 = bookRepository.save(book);
        return book1;
    }


    public String updateBook(Book book) {
//        Fetch the data
        Optional<Book> book1 = bookRepository.findById(book.getBook_id());
        if(book1.isEmpty()){
            return "Repository Error";
        }
        try{
            book1.get().setBook_author(book.getBook_author());
            book1.get().setBook_name(book.getBook_name());
            book1.get().setBook_publication(book.getBook_publication());
            book1.get().setBook_category(book.getBook_category());
            book1.get().setBook_pages(book.getBook_pages());
            book1.get().setBook_price(book.getBook_price());
            
            bookRepository.save(book1.get());
            return "Updated Successfully";
            
        }catch(Exception ex){
           return "Update Failed";
        }

    }

    public String deleteBook(String bookId) {

//        1. Fetch the student object whose id is equal to given student id
        Book book1 = bookRepository.findById(bookId).get();
        try{
            bookRepository.delete(book1);
            return "Delete Successfully";
        }catch(Exception ex){
            return "Delete failed";
        }
    }

    public Book getBook(String bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        if(book.isEmpty()){
            return null;
        }
        return book.get();
    }
}
