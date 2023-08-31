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

@Component
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
        Course course2 = new Course("Introduction to Data Science", "Manchester", Rating.FOUR);
        Course course3 = new Course("Creative Writing Workshop", "Edinburgh", Rating.FIVE);
        Course course4 = new Course("Financial Management for Entrepreneurs", "Birmingham", Rating.ONE);
        Course course5 = new Course("Photography Masterclass", "Bristol", Rating.THREE);
        Course course6 = new Course("Introduction to Artificial Intelligence", "Glasgow", Rating.FIVE);
        Course course7 = new Course( "Public Speaking Confidence", "Leeds", Rating.THREE);
        Course course8 = new Course("Web Development Bootcamp", "Brighton", Rating.TWO);
        Course course9 = new Course("Fashion Design Fundamentals", "Nottingham", Rating.FOUR);
        Course course10 = new Course("Mindfulness and Stress Reduction", "Newcastle", Rating.FIVE);

        Customer customer1 = new Customer("Emily Turner", "London", 28);
        Customer customer2 = new Customer("James Mitchell", "Manchester", 35);
        Customer customer3 = new Customer("Lucy Fraser", "Edinburgh", 42);
        Customer customer4 = new Customer("Daniel Patel", "Birmingham", 24);
        Customer customer5 = new Customer("Charlotte Foster", "Bristol", 31);
        Customer customer6 = new Customer("Oliver Campbell", "Glasgow", 29);
        Customer customer7 = new Customer("William Thompson", "Leeds", 40);
        Customer customer8 = new Customer("Mia Green", "Brighton", 22);
        Customer customer9 = new Customer("Ethan Wright", "Nottingham", 26);
        Customer customer10 = new Customer("Sophia Williams", "Newcastle", 37);

        Booking booking1 = new Booking("15/09/23", course1, customer1);
        Booking booking2 = new Booking("03/11/23", course2, customer2);
        Booking booking3 = new Booking("28/01/24", course3, customer3);
        Booking booking4 = new Booking("07/03/24", course4, customer4);
        Booking booking5 = new Booking("19/05/24", course5, customer5);
        Booking booking6 = new Booking("11/07/24", course6, customer6);
        Booking booking7 = new Booking("22/09/24", course7, customer7);
        Booking booking8 = new Booking("14/11/24", course8, customer8);
        Booking booking9 = new Booking("09/01/24", course9, customer9);
        Booking booking10 = new Booking("28/02/24", course10, customer10);
        Booking booking11 = new Booking("19/04/24", course1, customer6);
        Booking booking12 = new Booking("08/06/24", course2, customer3);
        Booking booking13 = new Booking("29/07/24", course3, customer9);
        Booking booking14 = new Booking("18/09/24", course4, customer5);
        Booking booking15 = new Booking("07/11/24", course5, customer8);
        Booking booking16 = new Booking("26/12/24", course6, customer1);
        Booking booking17 = new Booking("15/02/23", course7, customer10);
        Booking booking18 = new Booking("05/04/23", course8, customer2);
        Booking booking19 = new Booking("24/06/23", course9, customer7);
        Booking booking20 = new Booking("13/08/23", course10, customer4);
    }
}
