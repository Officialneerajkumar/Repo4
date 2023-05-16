package com.example.Student.Management.System.dao;

import com.example.Student.Management.System.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
