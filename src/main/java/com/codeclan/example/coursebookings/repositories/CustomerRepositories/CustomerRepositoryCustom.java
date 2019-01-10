package com.codeclan.example.coursebookings.repositories.CustomerRepositories;

import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findAllCustomersForACourse(Long courseid);
    List<Customer> findAllCustomersForTownForCourse(Long courseId, String town);
    List<Customer> customersForCourseByTownAndAge(Long courseId, String town, int age);
}
