package com.example.Student.Management.System.service;

import com.example.Student.Management.System.dao.StudentRepo;
import com.example.Student.Management.System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        List<Student> students = studentRepo.findAll();
        return students;
    }
}
