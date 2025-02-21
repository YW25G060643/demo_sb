package com.calculator.demo_calculator.controller.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.calculator.demo_calculator.controller.CalculatorOperation;
import com.calculator.demo_calculator.dto.CalRequestDTO;
import com.calculator.demo_calculator.dto.CalResultDTO;
import com.calculator.demo_calculator.dto.DTOmapper.DTOmapper;
import com.calculator.demo_calculator.model.Operation;

@RestController
public class CalculatorController implements CalculatorOperation {
  @Autowired
  private DTOmapper mapper;

  @Override
  public CalResultDTO calculate1(String x, String y, String operation) {
    Double param1 = Double.valueOf(x);
    Double param2 = Double.valueOf(y);
    Operation operator = Operation.of(operation);
    Double result = calcaulte(param1, param2, operator);
    System.out.println(result);
    return this.mapper.map(param1, param2, operator, result);
  }

  @Override
  public CalResultDTO calculate2(String x, String y, String operation) {
    Double param1 = Double.valueOf(x);
    Double param2 = Double.valueOf(y);
    Operation operator = Operation.of(operation);
    Double result = calcaulte(param1, param2, operator);
    System.out.println(result);
    return this.mapper.map(param1, param2, operator, result);
  }

  @Override
  public CalResultDTO calculate3(CalRequestDTO reqDTO) {
    Double param1 = Double.valueOf(reqDTO.getX());
    Double param2 = Double.valueOf(reqDTO.getY());
    Operation operator = Operation.of(reqDTO.getOperation());
    Double result = calcaulte(param1, param2, operator);
    System.out.println(result);
    return this.mapper.map(param1, param2, operator, result);
  }

  private Double calcaulte(Double x, Double y, Operation operation) {
    return switch (operation) {
      case ADD -> BigDecimal.valueOf(x).add(BigDecimal.valueOf(y))
          .doubleValue();
      case SUB -> BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y))
          .doubleValue();
      case MUL -> BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))
          .doubleValue();
      case DIV -> BigDecimal.valueOf(10.0)
          .divide(BigDecimal.valueOf(3.0), 5, RoundingMode.HALF_DOWN)
          .doubleValue();
    };
  }
}