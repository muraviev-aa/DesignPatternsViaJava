package architecturalPatterns.mvc;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<AccountListener> listeners;
    private String name;
    private double amount;

    public Account(String name, double startAmount) {
        this.name = name;
        this.amount = startAmount;
        this.listeners = new ArrayList<>();
    }

    public boolean isOverdrawn() {
        return this.amount < 0;
    }

    public void addFunds(double amount) {
        this.amount += amount;
        for (AccountListener listener : listeners) {
            listener.notifyFundsChanged(getAmount());
        }
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void addAccountListener(AccountListener listener) {
        listeners.add(listener);
    }

    public void removeAccountListener(AccountListener listener) {
        listeners.remove(listener);
    }

    public void removeAllAccountListener() {
        listeners.clear();
    }
}
