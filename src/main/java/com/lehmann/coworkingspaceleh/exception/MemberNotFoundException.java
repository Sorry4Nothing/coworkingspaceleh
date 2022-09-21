package com.lehmann.coworkingspaceleh.exception;

public class MemberNotFoundException extends RuntimeException{
    public MemberNotFoundException(String message){
        super(message);
    }
}