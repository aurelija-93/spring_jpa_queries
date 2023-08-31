package com.codeclan.course_bookings.repositories;

import com.codeclan.course_bookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
