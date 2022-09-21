package com.lehmann.coworkingspaceleh.exception;

public class MemberHasBookingsException extends RuntimeException{
    public MemberHasBookingsException(String message){
        super(message);
    }
}