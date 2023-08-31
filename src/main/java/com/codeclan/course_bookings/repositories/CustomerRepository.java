package com.codeclan.course_bookings.repositories;

import com.codeclan.course_bookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
