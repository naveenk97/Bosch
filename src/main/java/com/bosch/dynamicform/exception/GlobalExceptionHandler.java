package com.bosch.dynamicform.exception;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<Response> handleResourceNotFound(ResourceNotFound exception) {
        Response response=new Response();
        response.setMessage(exception.getMessage());
        response.setStatus(404);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Response> handleBusinessException(BadRequestException exception) {
        Response response = new Response();
        response.setMessage(exception.getMessage());
        response.setStatus(400);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Response> handleIllegalArgument(MethodArgumentTypeMismatchException exception) {
        Response response = new Response();
        String name = exception.getName();
        if (name.equals("status")) {
            response.setMessage("No enum constant for '" + name + "' value : " + exception.getValue());
        } else {
            response.setMessage("Argument type mismatch");
        }
        response.setStatus(400);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Response> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
        Response response = new Response();
        if (Objects.requireNonNull(exception.getMessage()).contains("ProductAvailabilityRequest[\"type\"]")) {
            response.setMessage("No enum constant for 'type' value");
        } else {
            response.setMessage(exception.getLocalizedMessage());
        }
        response.setStatus(400);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleException(Exception exception) {
        Response response = new Response();
        response.setMessage(exception.getMessage());
        response.setStatus(500);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<Response> handleCustomException(Exception exception) {
        Response response = new Response();
        response.setMessage(exception.getMessage());
        response.setStatus(400);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }
}
