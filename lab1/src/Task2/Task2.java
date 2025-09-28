package Task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (for example: 2 + 4, 3 * 5 =, 6 / 2 = ?):");
        String input = scanner.nextLine();

        try {
            double result = evaluateExpression(input);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double evaluateExpression(String input) {
        input = input.replace("=", "").replace("?", "").trim();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Incorrect expression format. Example: 2 + 2");
        }

        double num1;
        double num2;
        String operator = parts[1];

        try {
            num1 = Double.parseDouble(parts[0]);
            num2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unable to recognize numbers.");
        }

        switch (operator) {
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;

            case "*":
                return num1 * num2;

            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero is prohibited.");
                }
                return num1 / num2;

            default:
                throw new IllegalArgumentException("Unknown operation: " + operator);
        }
    }
}
