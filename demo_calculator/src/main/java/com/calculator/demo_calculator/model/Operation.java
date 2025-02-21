package com.calculator.demo_calculator.model;

public enum Operation {
    SUB, ADD, MUL, DIV,;

    public static Operation of(String value){
        for(Operation o : values()){
            if (o.name().equals(value.toUpperCase())) {
                return o;
            }
        }
        throw new IllegalArgumentException("No Such Operation.");
    }
}
