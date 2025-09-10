public class Task7BankAccount {
    private Task7User owner;
    private Task7Bank bank;
    private double balance;

    public Task7BankAccount(Task7User owner, Task7Bank bank, double initialBalance) {
        this.owner = owner;
        this.bank = bank;
        this.balance = initialBalance;
    }

    public Task7User getOwner() { return owner; }
    public Task7Bank getBank() { return bank; }
    public double getBalance() { return balance; }
    public String getCurrency() { return bank.getCurrency(); }

    public boolean transfer(Task7BankAccount toAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return false;
        }
        if (balance < amount) {
            System.out.println("Insufficient funds.");
            return false;
        }

        double commissionRate = getCommissionRate(this, toAccount);
        double commission = amount * commissionRate;
        double totalDebit = amount + commission;

        if (balance < totalDebit) {
            System.out.println("Insufficient funds to cover commission.");
            return false;
        }

        double convertedAmount = convertAmount(this, toAccount, amount);

        balance -= totalDebit;
        toAccount.balance += convertedAmount;

        System.out.printf("Transfer successful: %.2f %s (commission %.2f%%)\n",
                amount, getCurrency(), commissionRate * 100);
        System.out.printf("Converted amount received: %.2f %s\n", convertedAmount, toAccount.getCurrency());

        return true;
    }

    private double getCommissionRate(Task7BankAccount from, Task7BankAccount to) {
        boolean sameUser = from.getOwner() == to.getOwner();
        boolean sameBank = from.getBank() == to.getBank();

        if (sameUser && sameBank) return 0.0;
        if (sameUser && !sameBank) return 0.02;
        if (!sameUser && sameBank) return 0.03;
        return 0.06;
    }

    private double convertAmount(Task7BankAccount from, Task7BankAccount to, double amount) {
        Task7Bank fromBank = from.getBank();
        Task7Bank toBank = to.getBank();

        if (fromBank == toBank) {
            return fromBank.convert(from.getCurrency(), to.getCurrency(), amount);
        } else {
            double amountInFromBankCurrency = amount;
            double amountInToBankCurrency = fromBank.convert(from.getCurrency(), toBank.getCurrency(), amountInFromBankCurrency);
            return amountInToBankCurrency;
        }
    }

    @Override
    public String toString() {
        return String.format("Account: %s, Bank: %s, Balance: %.2f %s",
                owner.getName(), bank.getName(), balance, getCurrency());
    }
}
