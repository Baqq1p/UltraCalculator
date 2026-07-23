package com.example.calculator;

public class Calculator {

    public static final String ERR_INVALID_FORMAT = "Ошибка, неверный формат.";
    public static final String ERR_DIVISION_BE_ZERO = "Ошибка, деление на ноль невозможно.";

    private static final String OPERATOR_PLUS = "+";
    private static final String OPERATOR_MINUS = "-";
    private static final String OPERATOR_MULTIPLY = "*";
    private static final String OPERATOR_DIVIDE = "/";

    public int calculate(int firstNumber, int secondNumber, String symbol) {
        switch (symbol) {
            case OPERATOR_PLUS:
                return firstNumber + secondNumber;
            case OPERATOR_MINUS:
                return firstNumber - secondNumber;
            case OPERATOR_MULTIPLY:
                return firstNumber * secondNumber;
            case OPERATOR_DIVIDE:
                return divide(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException(ERR_INVALID_FORMAT);
        }
    }

    private int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException(ERR_DIVISION_BE_ZERO);
        } else {
            return firstNumber / secondNumber;
        }
    }

}
