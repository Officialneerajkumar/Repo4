package com.example.Student.Management.System.service;

import com.example.Student.Management.System.dao.BookRepo;
import com.example.Student.Management.System.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public List<Book> getAllBook() {
        List<Book> books = bookRepo.findAll();
        return books;
    }
}
