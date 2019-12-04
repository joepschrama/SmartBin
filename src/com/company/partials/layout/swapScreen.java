package com.company.partials.layout;

import com.company.Notification.SNotification;
import com.company.Smartbininlog;

import javax.swing.*;
import java.util.ArrayList;

public class swapScreen
{
    static boolean deviceScreen = false;
    static boolean averageScreen = false;
    static boolean notificationScreen = false;
    static boolean settingScreen = false;

    public swapScreen(String newScreen)
    {
        deviceScreen = false;
        averageScreen = false;
        notificationScreen = false;
        settingScreen = false;

        switch (newScreen) {
            case "device":
                deviceScreen = true;
                break;
            case "average":
                averageScreen = true;
                break;
            case "notifications":
                //new screen(new SNotification().Notifpanel, "Login screen", true);

                //screen.setContent(new SNotification().Notifpanel, "notifications");
                //screen test = new screen(new SNotification().Notifpanel, "Notification screen", true);
                notificationScreen = true;
                break;
            case "settings":
                settingScreen = true;
                break;
        }


        System.out.println("device:" + deviceScreen);
        System.out.println("average:" + averageScreen);
        System.out.println("notification:" + notificationScreen);
        System.out.println("setting:" + settingScreen);
        System.out.println();
    }
}
