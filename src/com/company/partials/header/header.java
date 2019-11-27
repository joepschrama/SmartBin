package com.company.partials.header;

import javax.swing.*;

public class header
{
    public JPanel headerPanel;
    private JLabel greetLabel;
    private JLabel headerTitle;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Header");
        frame.setContentPane(new header().headerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public header() {
        String username = "Saratje";
        headerTitle.setText("SmartBin");
        greetLabel.setText("Hi, " + username);
    }
}
