import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary representation: " + binary);
    }
}
