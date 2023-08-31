package com.codeclan.course_bookings.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int age;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"customer"})
    private List<Booking> bookings;

    public Customer(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.bookings = new ArrayList<>();
    }

    public Customer() {
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

    public int getAge() {
        return age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
