package com.ecom.trip.holiday.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@ControllerAdvice
public class ProductExceptionController {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<Object> exception(ResourceNotFoundException exception) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), "Products not found");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
