package com.calculator.demo_calculator.dto.DTOmapper;

import org.springframework.stereotype.Component;
import com.calculator.demo_calculator.dto.CalResultDTO;
import com.calculator.demo_calculator.model.Operation;

@Component
public class DTOmapper {
    public CalResultDTO map(String x, String y, Operation operation, Double result){
        return CalResultDTO builder()
            .x(String.valueOf(x))
            .y(String.valueOf(y))
            .operation(operation.name().toLowerCase())
            .result(String.valueOf(result))
            .build();
    }
}
