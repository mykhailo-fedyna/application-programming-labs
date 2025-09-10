import java.util.HashMap;
import java.util.Map;

public class Task7Bank {
    private String name;
    private String currency;
    private Map<String, Double> ratesToBase;

    public Task7Bank(String name, String currency) {
        this.name = name;
        this.currency = currency;
        this.ratesToBase = new HashMap<>();
        ratesToBase.put(currency, 1.0);
    }

    public String getName() { return name; }
    public String getCurrency() { return currency; }

    public void addRate(String currencyCode, double rateToBase) {
        ratesToBase.put(currencyCode, rateToBase);
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!ratesToBase.containsKey(fromCurrency) || !ratesToBase.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Unknown currency conversion rate.");
        }
        double amountInBase = amount / ratesToBase.get(fromCurrency);
        return amountInBase * ratesToBase.get(toCurrency);
    }

    public Task7BankAccount createAccount(Task7User user, double initialBalance) {
        Task7BankAccount account = new Task7BankAccount(user, this, initialBalance);
        user.addAccount(account);
        return account;
    }
}
