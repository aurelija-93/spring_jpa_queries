package com.codeclan.course_bookings.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private Rating rating;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"course"})
    private List<Booking> bookings;

    public Course(String name, String location, Rating rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.bookings = new ArrayList<>();
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Rating getRating() {
        return rating;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
