package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.company.partials.layout.screen;

public class Smartbininlog {
    private JButton Loginbutton;
    private JTextField Username;
    private JTextField Password;
    public JPanel Loginview;

    public static void main(String[] args)
    {
        new screen(new Smartbininlog().Loginview, "Login screen");
    }

    public Smartbininlog()
    {
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
