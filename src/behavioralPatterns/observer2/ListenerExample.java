package behavioralPatterns.observer2;

import javax.swing.*;

public class ListenerExample extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("The Observer in Swing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        MyMouseListener listener = new MyMouseListener();
        frame.addMouseListener(listener);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
