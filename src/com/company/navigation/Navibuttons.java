package com.company.navigation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navibuttons {
    private JButton devicesbutton;
    private JButton averagebutton;
    private JButton notificationbutton;
    private JButton settingbutton;
    private JPanel naviPanel;
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");

    public static void main(String[] args) {
        JFrame frame = new JFrame("log in screen");
        frame.setContentPane(new Navibuttons().naviPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Navibuttons() {
        devicesbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame,"Hi! this is the devices button :D" );

            }
        });
        averagebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame,"Hi! and welcome to the average button :D" );

            }
        });
        notificationbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame,"Hi! I'm here to annoy you with notifications :D" );

            }
        });
        settingbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(frame,"Hi! tHIs Is tHe SEtTiNgs bUtTonS O,o" );

            }
        });
    }
}
