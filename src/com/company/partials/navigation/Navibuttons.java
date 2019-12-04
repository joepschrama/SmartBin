package com.company.partials.navigation;

import com.company.device.deviceOverview;
import com.company.partials.layout.screen;
import com.company.partials.layout.swapScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navibuttons {
    private JButton devicesbutton;
    private JButton averagebutton;
    private JButton notificationbutton;
    private JButton settingbutton;
    public JPanel naviPanel;

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
                //new screen(frame, new deviceOverview().deviceOverview, "device overview screen", true);
                new swapScreen("device");
                //JOptionPane.showMessageDialog(frame,"Hi! this is the devices button :D" );
            }
        });
        averagebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new swapScreen("average");
                //JOptionPane.showMessageDialog(frame,"Hi! and welcome to the average button :D" );
            }
        });
        notificationbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new swapScreen("notifications");
                //JOptionPane.showMessageDialog(frame,"Hi! I'm here to annoy you with notifications :D" );
            }
        });
        settingbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new swapScreen("settings");
                //JOptionPane.showMessageDialog(frame,"Hi! tHIs Is tHe SEtTiNgs bUtTonS O,o" );
            }
        });
    }
}
