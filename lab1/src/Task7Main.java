public class Task7Main {
    public static void main(String[] args) {
        Task7User alice = new Task7User("Alice");
        Task7User bob = new Task7User("Bob");

        Task7Bank bankUAH = new Task7Bank("UkrBank", "UAH");
        bankUAH.addRate("USD", 0.036);
        bankUAH.addRate("EUR", 0.03);
        bankUAH.addRate("CAD", 0.028);

        Task7Bank bankUSD = new Task7Bank("USABank", "USD");
        bankUSD.addRate("UAH", 27.5);
        bankUSD.addRate("EUR", 0.83);
        bankUSD.addRate("CAD", 1.25);

        Task7BankAccount aliceAccUAH = bankUAH.createAccount(alice, 10000);
        Task7BankAccount aliceAccUSD = bankUSD.createAccount(alice, 500);

        Task7BankAccount bobAccUAH = bankUAH.createAccount(bob, 8000);

        System.out.println("Initial balances:");
        System.out.println(aliceAccUAH);
        System.out.println(aliceAccUSD);
        System.out.println(bobAccUAH);

        System.out.println("\nTransfer 1000 UAH between own accounts in the same bank (0% commission):");
        aliceAccUAH.transfer(aliceAccUAH, 1000); // transfer to self, just test

        System.out.println("\nTransfer 100 USD between own accounts in different banks (2% commission):");
        aliceAccUSD.transfer(aliceAccUAH, 100);

        System.out.println("\nTransfer 2000 UAH from Alice to Bob in same bank (3% commission):");
        aliceAccUAH.transfer(bobAccUAH, 2000);

        System.out.println("\nTransfer 50 USD from Alice to Bob in different banks (6% commission):");
        aliceAccUSD.transfer(bobAccUAH, 50);

        System.out.println("\nFinal balances:");
        System.out.println(aliceAccUAH);
        System.out.println(aliceAccUSD);
        System.out.println(bobAccUAH);
    }
}
