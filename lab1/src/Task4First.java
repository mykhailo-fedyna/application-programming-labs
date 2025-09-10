import java.util.Scanner;

public class Task4First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        Task4Second[] pairs = new Task4Second[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;

            if (pairs[ascii] == null) {
                pairs[ascii] = new Task4Second(ch, 1);
            } else {
                pairs[ascii].count++;
            }
        }

        System.out.println("Number of each character:");
        for (Task4Second pair : pairs) {
            if (pair != null) {
                System.out.println(pair);
            }
        }
    }
}
