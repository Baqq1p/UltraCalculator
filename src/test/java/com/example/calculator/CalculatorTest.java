package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void additionReturnsCorrectResult() {
        assertEquals(8.0, calculator.calculate(5, 3, "+"), 0.001);
    }
}
