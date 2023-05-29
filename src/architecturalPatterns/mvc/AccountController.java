package architecturalPatterns.mvc;

import javax.swing.*;

public class AccountController {
    private Account model;

    public AccountController(Account model, AccountWindow view) {
        this.model = model;
    }

    public void notifyAddFunds(double amount) {
        model.addFunds(amount);
    }

    public static void main(String[] args) {
        Account myAccount = new Account("Plant Corp", 0);
        AccountWindow myView = new AccountWindow();
        AccountController controller = new AccountController(myAccount, myView);
        myView.registerController(controller);
        myAccount.addAccountListener(myView);
        myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myView.setVisible(true);
    }
}
