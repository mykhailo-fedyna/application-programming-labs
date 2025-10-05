package Task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your query in the following format: <amount> <currency_from> into <currency_to>");
        System.out.println("For example: 100 UAH into USD");

        String input = scanner.nextLine().trim();
        try {
            double result = convert(input);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double convert(String input) throws Exception {
        String[] parts = input.split(" ");

        if (parts.length != 4 || !parts[2].equalsIgnoreCase("into")) {
            throw new Exception("Invalid format. Use: <amount> <currency> into <currency>");
        }

        double amount;
        try {
            amount = Double.parseDouble(parts[0]);
        } catch (NumberFormatException e) {
            throw new Exception("The amount must be a number.");
        }

        String from = parts[1].toUpperCase();
        String to = parts[3].toUpperCase();

        double rateFrom = getRate(from);
        double rateTo = getRate(to);

        double inUah = amount / rateFrom;
        double result = inUah * rateTo;

        return Math.round(result * 100.0) / 100.0;
    }

    // Метод для отримання курсу валюти до гривні
    public static double getRate(String currency) throws Exception {
        return switch (currency) {
            case "UAH" -> 1.0;
            case "USD" -> 0.027;
            case "CAD" -> 0.037;
            case "EUR" -> 0.025;
            default -> throw new Exception("Unsupported currency. Available: UAH, USD, CAD, EUR.");
        };
    }
}
