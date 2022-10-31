package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.Book;
import com.example.myfirstproject.repository.BookRepository;
import com.example.myfirstproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    public Book createBook(Book book){
      return bookRepository.save(book);
    }
    public String getBookName(String bookAuthor){
        return bookRepository.getBookName(bookAuthor);
    }
}
