package com.company;

import com.company.Notification.SNotification;
import com.company.database.connections.*;
import com.company.database.models.*;
import com.company.partials.layout.screen;

import java.sql.SQLException;
import java.util.List;

public class Main {

//    public static void main(String[] args)
//    {
//        //screen.setContent(new SNotification().Notifpanel, "notifications");
//        new screen(new Smartbininlog().Loginview, "Login screen", true);
//    }

    public static void main(String[] args) throws SQLException {
        String usercode = "uc002";
        Setting setting = new settingConnection().userSetting(usercode); // setting connected to one user
        System.out.println("setting: " + setting);
        Language language = new languageConnection().settingLanguage(setting); // language connected to one setting
        System.out.println("  language: " + language.getDescription());
        List<DeviceGroup> deviceGroups = new deviceGroupConnection().userDeviceGroup(usercode); // all deviceGroups for one user
        for (DeviceGroup deviceGroup : deviceGroups) {
            System.out.println("deviceGroup: " + deviceGroup.getName());
            List<Location> locations = new locationConnection().groupLocation(deviceGroup); // all locations for one devicegroup
            for (Location location : locations) {
                System.out.println("  location: " + location.getName());
                List<Device> devices = new deviceConnection().locationDevice(location); // all devices for one location
                for (Device device : devices) {
                    System.out.println("    device: " + device.getName());
                    Garbage garbage = new garbageConnection().deviceGarbage(device); // garbage connected to one device
                    System.out.println("      garbage: " + garbage.getYearlyUsage());
                    System.out.println("      notifications:");
                    List<Notification> notifications = new notificationConnection().deviceNotification(device); // all notifications for one device
                    for (Notification notification : notifications) {
                        System.out.println("        " + notification.getDescription());
                    }
                }
            }
        }
    }
}
