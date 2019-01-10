package com.codeclan.example.coursebookings.projections;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedForCourse", types= Course.class)
public interface EmbedForCourse {
    String getName();
    String getTown();
    int getRating();
    List<Booking> getBookings();
}
