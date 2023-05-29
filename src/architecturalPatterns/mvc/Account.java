package architecturalPatterns.mvc;

public class Account {
    private String name;
    private double amount;

    public Account(String name, double startAmount) {
        this.name = name;
        this.amount = startAmount;
    }

    public boolean isOverdrawn() {
        return this.amount < 0;
    }

    public void addFunds(double amount) {
        this.amount += amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
