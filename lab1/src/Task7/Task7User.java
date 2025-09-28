package Task7;

public class Task7User {
    private String name;
    private Task7BankAccount[] accounts = new Task7BankAccount[10];
    private int accountCount = 0;

    public Task7User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Task7BankAccount account) {
        accounts[accountCount++] = account;
    }

    public Task7BankAccount[] getAccounts() {
        return accounts;
    }
}
