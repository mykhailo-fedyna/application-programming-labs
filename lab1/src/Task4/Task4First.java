package Task4;

import java.util.Scanner;

public class Task4First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine().toLowerCase();

        Task4Second[] pairs = new Task4Second[input.length()];
        int size = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (pairs[j].character == ch) {
                    pairs[j].count++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                pairs[size++] = new Task4Second(ch, 1);
            }
        }

        System.out.println("Number of each character:");
        for (int i = 0; i < size; i++) {
            System.out.println(pairs[i]);
        }
    }
}
