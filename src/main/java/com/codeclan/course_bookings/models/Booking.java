package com.codeclan.course_bookings.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    @JsonIgnoreProperties({"bookings"})
    private Course course;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonIgnoreProperties({"bookings"})
    private Customer customer;

    public Booking(String date, Course course, Customer customer) {
        this.date = date;
        this.course = course;
        this.customer = customer;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Course getCourse() {
        return course;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
