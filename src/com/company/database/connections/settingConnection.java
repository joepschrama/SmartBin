package com.company.database.connections;

import com.company.database.models.Setting;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class settingConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//        List<Setting> settings = new settingConnection().list();
//
//        for (Setting setting : settings) {
//            System.out.println(setting);
//        }
//    }

    public List<Setting> list() throws SQLException
    {
        List<Setting> settings = new ArrayList<Setting>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from setting");
        ) {
            while (rs.next()) {
                Setting setting = new Setting();
                setting.setCode(rs.getString("settingcode"));
                setting.setNotifications(rs.getBoolean("notifications"));
                setting.setLanguagecode(rs.getString("languagecode"));
                setting.setUsercode(rs.getString("usercode"));
                settings.add(setting);
            }
        }
        return settings;
    }

    public static Setting userSetting(String usercode) throws SQLException
    {
        Setting setting = new Setting();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from setting where usercode='"+usercode+"'");
        ) {
            while (rs.next()) {
                setting.setCode(rs.getString("settingcode"));
                setting.setNotifications(rs.getBoolean("notifications"));
                setting.setLanguagecode(rs.getString("languagecode"));
                setting.setUsercode(rs.getString("usercode"));
            }
        }
        return setting;
    }
}
