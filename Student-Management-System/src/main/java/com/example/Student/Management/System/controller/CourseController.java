package com.example.Student.Management.System.controller;

import com.example.Student.Management.System.model.Course;
import com.example.Student.Management.System.model.Student;
import com.example.Student.Management.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping(name = "/create-course")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return new ResponseEntity<>("Course added successfully !! ", HttpStatus.CREATED);
    }
    @GetMapping("/get-all-course")
    public ResponseEntity<List<Course>> getAllCourse(){
        List<Course> courses = courseService.getAllCourse();
        return new ResponseEntity<>(courses,HttpStatus.FOUND);
    }
}
