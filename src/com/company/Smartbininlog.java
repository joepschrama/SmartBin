package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.smartbinHeader.header;
import com.company.navigation.Navibuttons;

public class Smartbininlog {
    private JButton Loginbutton;
    private JTextField Username;
    private JTextField Password;
    private JPanel Loginview;

    public static void main(String[] args) {
        JFrame frame = new JFrame("log in screen");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        mainPanel.add(new header().headerPanel, Component.TOP_ALIGNMENT);
        mainPanel.add(new Smartbininlog().Loginview, Component.CENTER_ALIGNMENT);
        mainPanel.add(new Navibuttons().naviPanel, Component.BOTTOM_ALIGNMENT);
        frame.setContentPane(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Smartbininlog() {
        Loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = Username.getText();
                String pass = Password.getText();
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");

                if (name.equals("Kevin")&& pass.equals("1234"))
                {
                    JOptionPane.showMessageDialog(frame,"Login succesful" );
                }
                else{
                    JOptionPane.showMessageDialog(frame,"byeeeeeeeeee");
                }
            }
        });
    }
}
