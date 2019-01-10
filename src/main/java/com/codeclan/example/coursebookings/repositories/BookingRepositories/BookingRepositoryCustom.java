package com.codeclan.example.coursebookings.repositories.BookingRepositories;

import com.codeclan.example.coursebookings.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    public List<Booking> findAllBookingsByDate(String date);
}
