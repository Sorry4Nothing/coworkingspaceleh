package com.lehmann.coworkingspaceleh.exception;

public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
