package com.company;

import com.company.Notification.SNotification;
import com.company.partials.layout.screen;

public class Main {

    public static void main(String[] args)
    {
        //screen.setContent(new SNotification().Notifpanel, "notifications");
        new screen(new Smartbininlog().Loginview, "Login screen", true);
    }
}
