package com.example.oopsem2week8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final List<Booking> bookings = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Optional<Booking> getBookingById(Long id) {
        return bookings.stream()
                .filter(b -> b.getBookingId().equals(id))
                .findFirst();
    }

    public Booking createBooking(Booking booking) {
        booking.setBookingId(idCounter++);
        bookings.add(booking);
        return booking;
    }

    public boolean deleteBooking(Long id) {
        return bookings.removeIf(b -> b.getBookingId().equals(id));
    }
}