package com.company.database.connections;

import com.company.database.models.Device;
import com.company.database.models.Location;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class deviceConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//        List<Device> devices = new deviceConnection().list();
//        List<Device> devices = new deviceConnection().locationDevice("lc001"); // all devices for one location
//
//        for (Device device : devices) {
//            System.out.println(device);
//        }
//    }

    public List<Device> list() throws SQLException
    {
        List<Device> devices = new ArrayList<Device>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from device");
        ) {
            while (rs.next()) {
                Device device = new Device();
                device.setCode(rs.getString("devicecode"));
                device.setName(rs.getString("name"));
                device.setLocationcode(rs.getString("locationcode"));
                device.setGarbagecode(rs.getString("garbagecode"));
                devices.add(device);
            }
        }
        return devices;
    }

    public List<Device> locationDevice(Location locationcode) throws SQLException
    {
        List<Device> devices = new ArrayList<Device>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from device where locationcode='"+locationcode+"'");
        ) {
            while (rs.next()) {
                Device device = new Device();
                device.setCode(rs.getString("devicecode"));
                device.setName(rs.getString("name"));
                device.setLocationcode(rs.getString("locationcode"));
                device.setGarbagecode(rs.getString("garbagecode"));
                devices.add(device);
            }
        }
        return devices;
    }
}
