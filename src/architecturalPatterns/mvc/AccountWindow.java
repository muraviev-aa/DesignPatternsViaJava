package architecturalPatterns.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountWindow extends JFrame {
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
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controller != null) {
                    controller.addFunds(Double.parseDouble(add.getText()));
                }
            }
        });

        this.add(funds);
        this.add(add);
        this.add(addButton);
    }

    public void updateView(double funds) {
        this.funds.setText("Your funds: " + funds);
        this.add.setText("");
    }

    public void setController(AccountController controller) {
        this.controller = controller;
    }
}
