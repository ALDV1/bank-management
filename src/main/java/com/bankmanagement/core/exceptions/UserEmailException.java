package com.bankmanagement.core.exceptions;

public class UserEmailException extends RuntimeException{
    private final String message;

    public UserEmailException(String message){
        this.message = message;
    }
    @Override
    public String toString() {
        return "    A user with this email already exists:  " + message ;
    }
}

