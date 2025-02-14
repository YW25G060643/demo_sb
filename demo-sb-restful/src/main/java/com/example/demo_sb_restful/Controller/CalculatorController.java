package com.bootcamp.demo.demo_sb_restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_restful.model.Operation;

// ! sum -> 1 + 2 -> return 3
// ! subtract -> 1 - 2 -> return -1
// ! multiply -> 1 * 2 -> return 2
// ! divide -> 9 / 3 -> return 3
@RestController // ! @RestController = @Controller + @ResponseBody
//@Controller -> During Srever start -> Create a object of calculatorController
@RequestMapping(value = "/v1")
public class CalculatorController {

  // http://localhost:8082/v1/operation/SUM?x=1&y=2
  @GetMapping(value = "/operation/{operation}")
  public Integer operate(@PathVariable Operation operation,
      @RequestParam Integer x, @RequestParam Integer y) {
    return switch (operation) {
      case SUM -> x + y;
      case SUBTRACT -> x - y;
      case MULTIPLY -> x * y;
      case DIVIDE -> {
        // int result = y == 0 ? 0 : x / y;
        // yield result;
        int result;
        try {
          result = x / y;
        } catch (ArithmeticException e) {
          result = 0;
        }
        yield result;
      }
    };
  }
}