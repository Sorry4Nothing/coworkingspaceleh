package com.lehmann.coworkingspaceleh.service;

import com.lehmann.coworkingspaceleh.exception.BookingNotFoundException;
import com.lehmann.coworkingspaceleh.repository.BookRepository;
import com.lehmann.coworkingspaceleh.model.BookingEntity;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class BookingService {

    private final BookRepository bookRepository;

    BookingService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookingEntity> loadAll() {
        log.info("Executing find all bookings ...");
        return bookRepository.findAll();
    }

    public List<BookingEntity> loadAllByName(String bookName) {
        log.info("Executing find bookings by name '" + bookName + "' ...");
        return bookRepository.findAllByName(bookName);
    }

    public BookingEntity loadOne(UUID bookId) {
        log.info("Executing find bookings with id " + bookId + " ...");
        return bookRepository.findById(bookId).orElseThrow(() -> new BookingNotFoundException("Booking not found with id " + bookId));
    }

    public BookingEntity create(BookingEntity booking) {
        log.info("Executing create booking with id " + booking.getId() + " ...");
        return bookRepository.save(booking);
    }

    public BookingEntity update(BookingEntity updatedBooking) {
        log.info("Executing update booking with id " + updatedBooking.getId() + " ...");
        val bookingId = updatedBooking.getId();
        bookRepository.findById(bookingId).orElseThrow(() -> new BookingNotFoundException("Booking not found with id " + bookingId));
        return bookRepository.save(updatedBooking);
    }

    public void delete(UUID bookingId) {
        log.info("Executing delete booking with id " + bookingId + " ...");
        bookRepository.findById(bookingId).orElseThrow(() -> new BookingNotFoundException("Booking not found with id " + bookingId));
        bookRepository.deleteById(bookingId);
    }

}