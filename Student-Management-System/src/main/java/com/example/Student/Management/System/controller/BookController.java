package com.example.Student.Management.System.controller;

import com.example.Student.Management.System.model.Book;
import com.example.Student.Management.System.model.Student;
import com.example.Student.Management.System.service.BookService;
import com.example.Student.Management.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(name = "/add-book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        bookService.addBook(book);
        return new ResponseEntity<>("Book added successfully !! ", HttpStatus.CREATED);
    }

    @GetMapping("/get-all-book")
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> books = bookService.getAllBook();
        return new ResponseEntity<>(books,HttpStatus.FOUND);
    }
}
