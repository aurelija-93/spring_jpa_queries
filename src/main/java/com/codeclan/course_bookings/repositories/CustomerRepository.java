package com.codeclan.course_bookings.repositories;

import com.codeclan.course_bookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseId(Long id);
    List<Customer> findByLocationIgnoreCaseAndBookingsCourseId(String location, Long id);

    List<Customer> findByAgeGreaterThanAndLocationIgnoreCaseAndBookingsCourseId(int age, String location, Long id);
}
