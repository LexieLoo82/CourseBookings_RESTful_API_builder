package com.codeclan.example.coursebookings.controllers;

import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.repositories.CourseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value="/getCoursesByRating/{rating}")
    public List<Course> findAllCoursesByRating(@PathVariable int rating){
        return courseRepository.findAllCoursesByRating(rating);
    }

    @GetMapping(value="/coursesForCustomer/{customerId}")
    public List<Course> findAllCoursesForCustomer(@PathVariable Long customerId){
        return courseRepository.findAllCoursesForCustomer(customerId);
    }
}
