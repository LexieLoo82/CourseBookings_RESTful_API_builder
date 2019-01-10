package com.codeclan.example.coursebookings.repositories.CourseRepositories;

import com.codeclan.example.coursebookings.models.Course;
import com.codeclan.example.coursebookings.projections.EmbedForBooking;
import com.codeclan.example.coursebookings.projections.EmbedForCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom{
}
