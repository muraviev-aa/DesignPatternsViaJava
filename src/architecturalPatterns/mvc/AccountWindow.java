package architecturalPatterns.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountWindow extends JFrame implements AccountListener, ActionListener {
    private JTextField funds, add;
    private JButton addButton;
    private AccountController controller;

    public AccountWindow() {
        this.setSize(400, 130);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        funds = new JTextField(30);
        funds.setEditable(false);
        add = new JTextField(30);
        addButton = new JButton("Add funds");
        addButton.addActionListener(this);
        this.add(funds);
        this.add(add);
        this.add(addButton);
    }

    public void registerController(AccountController controller) {
        this.controller = controller;
    }

    @Override
    public void notifyFundsChanged(double newAmount) {
        this.funds.setText("Your funds: " + newAmount);
        this.add.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.notifyAddFunds(Double.parseDouble(add.getText()));
    }
}
