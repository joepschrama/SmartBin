package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Smartbininlog {
    private JButton Loginbutton;
    private JTextField Username;
    private JTextField Password;
    private JPanel Loginview;

    public static void main(String[] args) {
        JFrame frame = new JFrame("log in screen");
        frame.setContentPane(new Smartbininlog().Loginview);
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
