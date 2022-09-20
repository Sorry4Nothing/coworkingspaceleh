package com.lehmann.coworkingspaceleh.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
