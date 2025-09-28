package Task7;

public class Task7Main {
    public static void main(String[] args) {
        Task7User alice = new Task7User("Alice");
        Task7User bob = new Task7User("Bob");

        Task7Bank bankUAH = new Task7Bank("UkrBank", "UAH", 27.5, 30.0);
        Task7Bank bankUSD = new Task7Bank("USABank", "USD", 1.0, 0.83);

        Task7BankAccount aliceUAH = new Task7BankAccount(alice, bankUAH, 10000);
        Task7BankAccount aliceUSD = new Task7BankAccount(alice, bankUSD, 500);
        Task7BankAccount bobUAH = new Task7BankAccount(bob, bankUAH, 8000);

        System.out.println("Початкові баланси:");
        aliceUAH.printBalance();
        aliceUSD.printBalance();
        bobUAH.printBalance();

        System.out.println("\nПереказ між власними рахунками одного банку (0%):");
        aliceUAH.transfer(aliceUAH, 1000);

        System.out.println("\nПереказ між власними рахунками різних банків (2%):");
        aliceUSD.transfer(aliceUAH, 100);

        System.out.println("\nПереказ Alice → Bob в одному банку (3%):");
        aliceUAH.transfer(bobUAH, 2000);

        System.out.println("\nПереказ Alice → Bob в різних банках (6%):");
        aliceUSD.transfer(bobUAH, 50);

        System.out.println("\nКінцеві баланси:");
        aliceUAH.printBalance();
        aliceUSD.printBalance();
        bobUAH.printBalance();
    }
}
