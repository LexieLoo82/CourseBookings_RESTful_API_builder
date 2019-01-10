package com.codeclan.example.coursebookings.controllers;

import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.models.Customer;
import com.codeclan.example.coursebookings.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/getAllCustomersForACourse/{courseid}")
    public List<Customer> getAllCustomersForACourse(@PathVariable Long courseid){
        return customerRepository.findAllCustomersForACourse(courseid);
    }

    @GetMapping(value="/customersForTownForCourse/{town}/{courseId}")
    public List<Customer> getAllCustomersForTownForCourse(@PathVariable Long courseId, @PathVariable String town){
        return customerRepository.findAllCustomersForTownForCourse(courseId, town);
    }

    @GetMapping(value="/byCourseAndTownAndAge/{town}/{courseId}/{age}")
    public List<Customer> getCustomersByCourseAndTownAndAge(@PathVariable Long courseId, @PathVariable String town, @PathVariable int age){
        return customerRepository.customersForCourseByTownAndAge(courseId, town, age);
    }
}
