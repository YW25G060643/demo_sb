package com.calculator.demo_calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CalResultDTO {
    private String x;
    private String y;
    private String operation;
    private String result;
}
