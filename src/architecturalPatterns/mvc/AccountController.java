package architecturalPatterns.mvc;

import javax.swing.*;

public class AccountController {
    private AccountWindow view;
    private Account model;

    public AccountController(Account model, AccountWindow view) {
        this.view = view;
        this.model = model;
    }

    public void addFunds(double amount) {
        model.addFunds(amount);
        view.updateView(model.getAmount());
    }

    public static void main(String[] args) {
        Account myAccount = new Account("Plant Corp", 5000);
        AccountWindow myView = new AccountWindow();
        AccountController controller = new AccountController(myAccount, myView);
        myView.setController(controller);
        myView.updateView(myAccount.getAmount());
        myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myView.setVisible(true);
    }
}
