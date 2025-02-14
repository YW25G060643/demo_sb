package com.example.demo_sb_restful.expection;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExpectionHandler {
    @ExceptionHandler(value = ArithmeticException.class)
    public ErrorResult handleAr
}
