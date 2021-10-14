package com.masai.Book.bookinfo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private String Book_id;
    private String Book_name;
    private String Book_author;
    private String Book_publication;
    private String Book_category;
    private String Book_pages;
    private String Book_price;

    public Book(){

    }

    public Book(String book_id, String book_name, String book_author, String book_publication, String book_category, String book_pages, String book_price) {
        Book_id = book_id;
        Book_name = book_name;
        Book_author = book_author;
        Book_publication = book_publication;
        Book_category = book_category;
        Book_pages = book_pages;
        Book_price = book_price;
    }

    public String getBook_id() {
        return Book_id;
    }

    public void setBook_id(String book_id) {
        Book_id = book_id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getBook_author() {
        return Book_author;
    }

    public void setBook_author(String book_author) {
        Book_author = book_author;
    }

    public String getBook_publication() {
        return Book_publication;
    }

    public void setBook_publication(String book_publication) {
        Book_publication = book_publication;
    }

    public String getBook_category() {
        return Book_category;
    }

    public void setBook_category(String book_category) {
        Book_category = book_category;
    }

    public String getBook_pages() {
        return Book_pages;
    }

    public void setBook_pages(String book_pages) {
        Book_pages = book_pages;
    }

    public String getBook_price() {
        return Book_price;
    }

    public void setBook_price(String book_price) {
        Book_price = book_price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book_id='" + Book_id + '\'' +
                ", Book_name='" + Book_name + '\'' +
                ", Book_author='" + Book_author + '\'' +
                ", Book_publication='" + Book_publication + '\'' +
                ", Book_category='" + Book_category + '\'' +
                ", Book_pages='" + Book_pages + '\'' +
                ", Book_price='" + Book_price + '\'' +
                '}';
    }
}
