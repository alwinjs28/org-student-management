package com.example.myfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.myfirstproject.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    Book save(Book book);
    @Query("SELECT bookName FROM Book WHERE bookAuther=?1")
    String getBookName(String bookAuther);
}


