package com.company.database.connections;

import com.company.database.models.DeviceGroup;
import com.company.database.models.Location;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class locationConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//          List<Location> locations = new locationConnection().list();
//          List<Location> locations = new locationConnection().groupLocation("gc001"); // all locations for one devicegroup
//
//        for (Location location : locations) {
//            System.out.println(location);
//        }
//    }

    public List<Location> list() throws SQLException
    {
        List<Location> locations = new ArrayList<Location>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from location");
        ) {
            while (rs.next()) {
                Location location = new Location();
                location.setCode(rs.getString("locationcode"));
                location.setName(rs.getString("name"));
                location.setDevicegroupcode(rs.getString("devicegroupcode"));
                locations.add(location);
            }
        }
        return locations;
    }

    public List<Location> groupLocation(DeviceGroup deviceGroupcode) throws SQLException
    {
        List<Location> locations = new ArrayList<Location>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from location where devicegroupcode ='"+deviceGroupcode+"'");
        ) {
            while (rs.next()) {
                Location location = new Location();
                location.setCode(rs.getString("locationcode"));
                location.setName(rs.getString("name"));
                location.setDevicegroupcode(rs.getString("devicegroupcode"));
                locations.add(location);
            }
        }
        return locations;
    }
}
