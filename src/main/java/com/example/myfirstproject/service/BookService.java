package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Book;

public interface BookService {
    Book createBook(Book book);
    String getBookName(String bookAuthor);
}
