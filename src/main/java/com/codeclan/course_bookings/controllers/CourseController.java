package com.codeclan.course_bookings.controllers;

import com.codeclan.course_bookings.models.Course;
import com.codeclan.course_bookings.repositories.CourseRepository;
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
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses")
    ResponseEntity<List<Course>> index(
            @RequestParam(required = false, name = "rating") Integer rating
    ) {
        List<Course> courses;
        if (rating != null) {
            courses = courseRepository.findByRating(rating);
        } else {
            courses = courseRepository.findAll();
        }
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/courses/{id}")
    ResponseEntity<Optional<Course>> show(@PathVariable Long id) {
        return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
    }
}
