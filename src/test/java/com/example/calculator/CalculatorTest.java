package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void additionReturnsCorrectResult() {
        assertEquals(8.0, calculator.calculate(5, 3, "+"), 0.001);
    }
    @Test
    void subtractionReturnsCorrectResult() {
        assertEquals(2.0, calculator.calculate(5, 3, "-"), 0.001);
    }
    @Test
    void multiplyReturnsCorrectResult() {
        assertEquals(15.0, calculator.calculate(5, 3, "*"), 0.001);
    }
    @Test
    void divideReturnsCorrectResult() {
        assertEquals(1.0, calculator.calculate(5, 3, "/"), 0.001);
    }
    @Test
    void divisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class,
                () -> calculator.calculate(5, 0, "/"));
    }


}
