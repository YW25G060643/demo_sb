package com.calculator.demo_calculator.expection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ErrorResult {
  private Integer code;
  private String message;
}