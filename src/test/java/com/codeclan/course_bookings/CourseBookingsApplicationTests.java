package com.codeclan.course_bookings;

import com.codeclan.course_bookings.models.Course;
import com.codeclan.course_bookings.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingsApplicationTests {
	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canFindCoursesByRating() {
		List<Course> foundCourses = courseRepository.findByRating(3);
		assertEquals(2, foundCourses.size());
	}
}
