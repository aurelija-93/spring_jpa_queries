package com.codeclan.course_bookings.repositories;

import com.codeclan.course_bookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByRating(int rating);

    List<Course> findByBookingsCustomerId(Long id);
}
