package com.codeclan.example.coursebookings.controllers;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.repositories.BookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value="/bydate/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date){
        return bookingRepository.findAllBookingsByDate(date);
    }
}
