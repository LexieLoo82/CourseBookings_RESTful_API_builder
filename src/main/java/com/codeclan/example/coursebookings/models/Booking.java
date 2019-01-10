package com.codeclan.example.coursebookings.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String date;

    @ManyToOne
    @JsonIgnoreProperties("bookings")
    @JoinColumn(name="course_id", nullable = false)
    private Course course;

    @ManyToOne
    @JsonIgnoreProperties("bookings")
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;

    public Booking(String date, Course course, Customer customer){
        this.date = date;
        this.course = course;
        this.customer = customer;
    }

    public Booking(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
