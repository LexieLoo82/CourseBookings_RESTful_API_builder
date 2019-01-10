package com.codeclan.example.coursebookings.projections;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedForBooking", types= Booking.class)
public interface EmbedForBooking {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
