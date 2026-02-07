package com.dev4vn.first_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {


    @Autowired
    private ErrorConfigProperties errorConfig;

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage handleTodoException(Exception ex, WebRequest request) {
        return new ErrorMessage(
                errorConfig.getNotFoundCode(),
                errorConfig.getNotFoundMsg()
        );
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleAllException(Exception ex, WebRequest request) {
        return new ErrorMessage(
                errorConfig.getServerErrorCode(),
                errorConfig.getServerErrorMsg()
        );
    }
}