package com.example.Student.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;
    @Column(name = "course_title")
    private String courseTitle;
    @Column(name = "course_description")
    private String courseDescription;
    @Column(name = "course_duration")
    private String courseDuration;
    @ManyToMany
    @JoinColumn(name = "fk_students_id")
    List<Student> studentList;

}
