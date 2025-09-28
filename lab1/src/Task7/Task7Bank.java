package Task7;

public class Task7Bank {
    private String name;
    private String currency;
    private double usdRate; // курс USD до базової валюти банку
    private double eurRate; // курс EUR до базової валюти банку

    public Task7Bank(String name, String currency, double usdRate, double eurRate) {
        this.name = name;
        this.currency = currency;
        this.usdRate = usdRate;
        this.eurRate = eurRate;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double amountInBase = amount;

        if (fromCurrency.equals("USD")) amountInBase /= usdRate;
        else if (fromCurrency.equals("EUR")) amountInBase /= eurRate;

        if (toCurrency.equals("USD")) return amountInBase * usdRate;
        else if (toCurrency.equals("EUR")) return amountInBase * eurRate;

        return amountInBase;
    }
}
