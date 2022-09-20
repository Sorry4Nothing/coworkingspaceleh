package com.lehmann.coworkingspaceleh.exception;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
