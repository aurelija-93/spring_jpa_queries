package com.codeclan.course_bookings.components;

import com.codeclan.course_bookings.models.Booking;
import com.codeclan.course_bookings.models.Course;
import com.codeclan.course_bookings.models.Customer;
import com.codeclan.course_bookings.models.Rating;
import com.codeclan.course_bookings.repositories.BookingRepository;
import com.codeclan.course_bookings.repositories.CourseRepository;
import com.codeclan.course_bookings.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course course1 = new Course("Digital Marketing Essentials", "London", Rating.TWO);
        courseRepository.save(course1);
        Course course2 = new Course("Introduction to Data Science", "Manchester", Rating.FOUR);
        courseRepository.save(course2);
        Course course3 = new Course("Creative Writing Workshop", "Edinburgh", Rating.FIVE);
        courseRepository.save(course3);
        Course course4 = new Course("Financial Management for Entrepreneurs", "Birmingham", Rating.ONE);
        courseRepository.save(course4);
        Course course5 = new Course("Photography Masterclass", "Bristol", Rating.THREE);
        courseRepository.save(course5);
        Course course6 = new Course("Introduction to Artificial Intelligence", "Glasgow", Rating.FIVE);
        courseRepository.save(course6);
        Course course7 = new Course( "Public Speaking Confidence", "Leeds", Rating.THREE);
        courseRepository.save(course7);
        Course course8 = new Course("Web Development Bootcamp", "Brighton", Rating.TWO);
        courseRepository.save(course8);
        Course course9 = new Course("Fashion Design Fundamentals", "Nottingham", Rating.FOUR);
        courseRepository.save(course9);
        Course course10 = new Course("Mindfulness and Stress Reduction", "Newcastle", Rating.FIVE);
        courseRepository.save(course10);

        Customer customer1 = new Customer("Emily Turner", "London", 28);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("James Mitchell", "Manchester", 35);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Lucy Fraser", "Edinburgh", 42);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Daniel Patel", "Birmingham", 24);
        customerRepository.save(customer4);
        Customer customer5 = new Customer("Charlotte Foster", "Bristol", 31);
        customerRepository.save(customer5);
        Customer customer6 = new Customer("Oliver Campbell", "Glasgow", 29);
        customerRepository.save(customer6);
        Customer customer7 = new Customer("William Thompson", "Leeds", 40);
        customerRepository.save(customer7);
        Customer customer8 = new Customer("Mia Green", "Brighton", 22);
        customerRepository.save(customer8);
        Customer customer9 = new Customer("Ethan Wright", "Nottingham", 26);
        customerRepository.save(customer9);
        Customer customer10 = new Customer("Sophia Williams", "Newcastle", 37);
        customerRepository.save(customer10);

        Booking booking1 = new Booking("15/09/23", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("03/11/23", course2, customer2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("28/01/24", course3, customer3);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("07/03/24", course4, customer4);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("19/05/24", course5, customer5);
        bookingRepository.save(booking5);
        Booking booking6 = new Booking("11/07/24", course6, customer6);
        bookingRepository.save(booking6);
        Booking booking7 = new Booking("22/09/24", course7, customer7);
        bookingRepository.save(booking7);
        Booking booking8 = new Booking("14/11/24", course8, customer8);
        bookingRepository.save(booking8);
        Booking booking9 = new Booking("09/01/24", course9, customer9);
        bookingRepository.save(booking9);
        Booking booking10 = new Booking("28/02/24", course10, customer10);
        bookingRepository.save(booking10);
        Booking booking11 = new Booking("19/04/24", course1, customer6);
        bookingRepository.save(booking11);
        Booking booking12 = new Booking("08/06/24", course2, customer3);
        bookingRepository.save(booking12);
        Booking booking13 = new Booking("29/07/24", course3, customer9);
        bookingRepository.save(booking13);
        Booking booking14 = new Booking("18/09/24", course4, customer5);
        bookingRepository.save(booking14);
        Booking booking15 = new Booking("07/11/24", course5, customer8);
        bookingRepository.save(booking15);
        Booking booking16 = new Booking("26/12/24", course6, customer1);
        bookingRepository.save(booking16);
        Booking booking17 = new Booking("15/02/23", course7, customer10);
        bookingRepository.save(booking17);
        Booking booking18 = new Booking("05/04/23", course8, customer2);
        bookingRepository.save(booking18);
        Booking booking19 = new Booking("24/06/23", course9, customer7);
        bookingRepository.save(booking19);
        Booking booking20 = new Booking("13/08/23", course10, customer4);
        bookingRepository.save(booking20);
    }
}
