package com.codeclan.course_bookings.repositories;

import com.codeclan.course_bookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
