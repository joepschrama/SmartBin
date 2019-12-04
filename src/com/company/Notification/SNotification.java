package com.company.Notification;

import com.company.partials.layout.screen;

import javax.swing.*;

public class SNotification {
    public JPanel Notifpanel;
    private JLabel boxtext1;
    private JLabel boxtext2;
    private JLabel boxtext3;
    private JLabel boxtime1;
    private JLabel boxtime2;
    private JLabel boxtime3;

    public static void main(String[] args) {
        new screen(new SNotification().Notifpanel, "Notification screen", true);
    }

    public SNotification()
    {
        boxtext1.setText("Im fed! thank you!!!! :D -Livingroom Smartbin");
        boxtext2.setText("The Bathroom Smartbin battery is at 15% pls charge :'(");
        boxtext3.setText("You throw 37% more waste this week, please think of the environment D: ");
        boxtime1.setText("today at 13:37");
        boxtime2.setText("2 days ago");
        boxtime3.setText("4 days ago");
    }

}
