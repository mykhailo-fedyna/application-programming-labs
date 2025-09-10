public class Task7User {
    private String name;
    private java.util.List<Task7BankAccount> accounts = new java.util.ArrayList<>();

    public Task7User(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addAccount(Task7BankAccount account) {
        accounts.add(account);
    }

    public java.util.List<Task7BankAccount> getAccounts() {
        return accounts;
    }
}
