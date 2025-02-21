package com.calculator.demo_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.demo_calculator.dto.CalRequestDTO;
import com.calculator.demo_calculator.dto.CalResultDTO;

public interface CalculatorOperation {
    @GetMapping(value = "/operation")
    CalResultDTO calculator1(@RequestParam String x, @RequestParam String y,
        @RequestParam String operation);
    
    @GetMapping(value = "/operation/{x}/{y}/{operation}")
    CalResultDTO calculator2(@PathVariable String x, @PathVariable String y,
        @PathVariable String operation);

    @PostMapping(value = "/operation")
    CalResultDTO calculator3(@RequestBody CalRequestDTO CalRequestDTO);
}
