package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Book;
import com.example.myfirstproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path="book")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/create_book",method= RequestMethod.POST)
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
    @RequestMapping(value="/g_bookName",method=RequestMethod.GET)
    public String getBookName(@RequestParam("author")String bookAuthor){
        return bookService.getBookName(bookAuthor);
    }
}
