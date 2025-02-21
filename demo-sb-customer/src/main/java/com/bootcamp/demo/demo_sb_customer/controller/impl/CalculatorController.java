package com.bootcamp.demo.demo_sb_customer.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements CalculatorOperation{
    @Autowired
    private CalculatorServce calculatorServce;

    //
    @Override
    public CalculatorResult calculate(int x, int y){
        return new CalculatorResult(
            calculatorServce.sum(x, y) - calculatorServce.subtract(x ,y);
        )
    }
}
