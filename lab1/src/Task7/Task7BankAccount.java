package Task7;

public class Task7BankAccount {
    private Task7User owner;
    private Task7Bank bank;
    private double balance;

    public Task7BankAccount(Task7User owner, Task7Bank bank, double balance) {
        this.owner = owner;
        this.bank = bank;
        this.balance = balance;
        owner.addAccount(this);
    }

    public Task7User getOwner() {
        return owner;
    }

    public Task7Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public boolean transfer(Task7BankAccount toAccount, double amount) {
        if (amount <= 0 || balance < amount) {
            System.out.println("Недостатньо коштів або неправильна сума.");
            return false;
        }

        double commissionRate;
        if (owner == toAccount.owner && bank == toAccount.bank) commissionRate = 0.0;
        else if (owner == toAccount.owner && bank != toAccount.bank) commissionRate = 0.02;
        else if (owner != toAccount.owner && bank == toAccount.bank) commissionRate = 0.03;
        else commissionRate = 0.06;

        double commission = amount * commissionRate;
        double total = amount + commission;
        if (balance < total) {
            System.out.println("Недостатньо коштів для комісії.");
            return false;
        }

        double convertedAmount = bank.convert(bank.getCurrency(), toAccount.getBank().getCurrency(), amount);

        balance -= total;
        toAccount.balance += convertedAmount;

        System.out.printf("Переведено %.2f %s (комісія %.2f%%), отримано %.2f %s\n",
                amount, bank.getCurrency(), commissionRate * 100, convertedAmount, toAccount.getBank().getCurrency());
        return true;
    }

    public void printBalance() {
        System.out.printf("%s - %s: %.2f %s\n", owner.getName(), bank.getName(), balance, bank.getCurrency());
    }
}
