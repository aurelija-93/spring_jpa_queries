package com.codeclan.course_bookings.controllers;

import com.codeclan.course_bookings.models.Customer;
import com.codeclan.course_bookings.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    ResponseEntity<List<Customer>> index(
            @RequestParam(required = false, name = "courseId") Long courseId,
            @RequestParam(required = false, name = "location") String location
    ) {
        List<Customer> customers;
        if (courseId != null && location != null) {
            customers = customerRepository.findByLocationIgnoreCaseAndBookingsCourseId(location, courseId);
        } else if (courseId != null) {
            customers = customerRepository.findByBookingsCourseId(courseId);
        } else {
            customers = customerRepository.findAll();
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/customers/{id}")
    ResponseEntity<Optional<Customer>> show(@PathVariable Long id) {
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }
}
