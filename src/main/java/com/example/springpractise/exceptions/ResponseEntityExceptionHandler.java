package com.example.springpractise.exceptions;

import com.example.springpractise.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ResponseEntityExceptionHandler extends
        org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundHandler(EmployeeNotFoundException employeeNotFoundException) {
        return new ErrorMessage(HttpStatus.NOT_FOUND, employeeNotFoundException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericException(Exception exception){
        return new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage() );
    }

}