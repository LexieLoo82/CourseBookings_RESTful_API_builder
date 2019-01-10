package com.codeclan.example.coursebookings.repositories.BookingRepositories;

import com.codeclan.example.coursebookings.models.Booking;
import com.codeclan.example.coursebookings.projections.EmbedForBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForBooking.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{
}
