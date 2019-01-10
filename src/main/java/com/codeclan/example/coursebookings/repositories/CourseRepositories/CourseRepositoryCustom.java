package com.codeclan.example.coursebookings.repositories.CourseRepositories;

import com.codeclan.example.coursebookings.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findAllCoursesByRating(int rating);
    List<Course> findAllCoursesForCustomer(Long customerId);
}
