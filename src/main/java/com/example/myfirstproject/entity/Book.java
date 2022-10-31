package com.example.myfirstproject.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private Long bookId;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_auther")
    private  String bookAuther;
    @Column(name = "book_published")
    private Date bookPublished;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuther() {
        return bookAuther;
    }

    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    public Date getBookPublished() {
        return bookPublished;
    }

    public void setBookPublished(Date bookPublished) {
        this.bookPublished = bookPublished;
    }
}
