package com.company.database.connections;

import com.company.database.models.Device;
import com.company.database.models.Notification;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class notificationConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//        List<Notification> notifications = new notificationConnection().list();
//
//        for (Notification notification : notifications) {
//            System.out.println(notification);
//        }
//    }

    public List<Notification> list() throws SQLException
    {
        List<Notification> notifications = new ArrayList<Notification>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from notification");
        ) {
            while (rs.next()) {
                Notification notification = new Notification();
                notification.setCode(rs.getString("notificationcode"));
                notification.setTimestamp(rs.getString("timestamp"));
                notification.setDescription(rs.getString("description"));
                notification.setDevicecode(rs.getString("devicecode"));
                notifications.add(notification);
            }
        }
        return notifications;
    }

    public List<Notification> deviceNotification(Device device) throws SQLException
    {
        List<Notification> notifications = new ArrayList<Notification>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from notification where devicecode='"+device+"'");
        ) {
            while (rs.next()) {
                Notification notification = new Notification();
                notification.setCode(rs.getString("notificationcode"));
                notification.setTimestamp(rs.getString("timestamp"));
                notification.setDescription(rs.getString("description"));
                notification.setDevicecode(rs.getString("devicecode"));
                notifications.add(notification);
            }
        }
        return notifications;
    }
}
