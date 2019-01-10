package com.codeclan.example.coursebookings.components;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.models.Customer;
import com.codeclan.example.coursebookings.repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.coursebookings.repositories.CourseRepositories.CourseRepository;
import com.codeclan.example.coursebookings.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){}


    public void run(ApplicationArguments args){
        Course java = new Course("Intro to Java", "Glasgow", 5);
        courseRepository.save(java);

        Course python = new Course("Intro to Python", "Dundee", 3);
        courseRepository.save(python);

        Course javaScript = new Course("Advanced JS", "Peth", 2);
        courseRepository.save(javaScript);

        Customer susan = new Customer("Susan", "Milngavie", 32);
        customerRepository.save(susan);

        Customer paul = new Customer("Paul", "Linlithgow", 19);
        customerRepository.save(paul);

        Customer jim = new Customer("Jim", "Linlithgow", 40);
        customerRepository.save(jim);

        Customer jack = new Customer("Jack", "Linlithgow", 34);
        customerRepository.save(jack);

        Customer angus = new Customer("Angus", "Linlithgow", 30);
        customerRepository.save(angus);


        Customer jason = new Customer("Jason", "Paisley", 65);
        customerRepository.save(jason);

        Booking booking1 = new Booking("12-12-19", java, susan);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("12-03-19", python, susan);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("12-08-19", java, paul);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("12-08-19", java, jim);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("12-08-19", java, jack);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("12-08-19", java, angus);
        bookingRepository.save(booking6);
    }

}
