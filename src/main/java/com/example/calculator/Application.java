package com.example.calculator;

import java.util.Scanner;

public class Application {

    private static final int PART_LEFT_NUMBER = 0;
    private static final int PART_OPERATOR = 1;
    private static final int PART_RIGHT_NUMBER = 2;
    private static final String PROMPT = "> ";
    private static final String RESULT_TEXT = " = ";
    private static final String EXIT_TEXT = "exit";


    private final Calculator calculator = new Calculator();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("--- Тесты ---");
        System.out.println("5 + 3 = " + calculator.calculate(5, 3, "+"));
        System.out.println("5 / 2 = " + calculator.calculate(5, 2, "/"));
        System.out.println("10 - 3 = " + calculator.calculate(10, 3, "-"));
        System.out.println("4 * 6 = " + calculator.calculate(4, 6, "*"));
        System.out.println("--- Конец тестов ---\n");
        while (true) {
            System.out.print(PROMPT);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(EXIT_TEXT)) {
                break;
            } else {
                processInput(input);
            }

        }

        scanner.close();
    }


    private void processInput(String input) {

        try {
            String parts[] = input.trim().split(" ");
            if(parts.length !=3){
                System.out.println(Calculator.ERR_INVALID_FORMAT);
                return;
            }

            int firstNumber = Integer.parseInt(parts[PART_LEFT_NUMBER]);
            int secondNumber = Integer.parseInt(parts[PART_RIGHT_NUMBER]);

            int result = calculator.calculate(firstNumber, secondNumber, parts[PART_OPERATOR]);
            System.out.println(input.trim() + RESULT_TEXT + result);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(Calculator.ERR_INVALID_FORMAT);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}