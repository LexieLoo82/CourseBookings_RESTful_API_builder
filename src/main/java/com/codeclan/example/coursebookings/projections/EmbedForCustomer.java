package com.codeclan.example.coursebookings.projections;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedForCustomer", types= Customer.class)
public interface EmbedForCustomer {
    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
