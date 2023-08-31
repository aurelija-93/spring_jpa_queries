package com.codeclan.course_bookings.repositories;

import com.codeclan.course_bookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDate(String date);
}
