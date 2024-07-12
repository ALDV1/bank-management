package com.bankmanagement.core.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handlerNotFoundException(NotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserEmailException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<?> handlerUserReqEmailException(UserEmailException exception) {
        return new ResponseEntity<>(exception.getMessage(),HttpStatus.CONFLICT);
    }
}
