package com.example.Student.Management.System.service;

import com.example.Student.Management.System.dao.CourseRepo;
import com.example.Student.Management.System.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public List<Course> getAllCourse() {
        List<Course> courses = courseRepo.findAll();
        return courses;
    }
}
