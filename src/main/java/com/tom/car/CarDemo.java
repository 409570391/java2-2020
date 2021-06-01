package com.tom.car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    static final int WIDTH = 600 ;
    static final int HEIGHT=400 ;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
