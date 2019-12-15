package com.company.database.connections;

import com.company.database.models.DeviceGroup;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class deviceGroupConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//      List<DeviceGroup> deviceGroups = new deviceGroupConnection().list(); // all deviceGroups
//      List<DeviceGroup> deviceGroups = new deviceGroupConnection().userDeviceGroup("uc002"); // all deviceGroups for one user
//
//       for (DeviceGroup deviceGroup : deviceGroups) {
//           System.out.println(deviceGroup);
//       }
//    }

    public List<DeviceGroup> list() throws SQLException
    {
        List<DeviceGroup> deviceGroups = new ArrayList<DeviceGroup>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from devicegroup");
        ) {
            while (rs.next()) {
                DeviceGroup deviceGroup = new DeviceGroup();
                deviceGroup.setCode(rs.getString("devicegroupcode"));
                deviceGroup.setName(rs.getString("name"));
                deviceGroup.setUsercode(rs.getString("usercode"));
                deviceGroups.add(deviceGroup);
            }
        }
        return deviceGroups;
    }

    public List<DeviceGroup> userDeviceGroup(String usercode) throws SQLException
    {
        List<DeviceGroup> deviceGroups = new ArrayList<DeviceGroup>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from devicegroup where usercode='"+usercode+"'");
        ) {
            while (rs.next()) {
                DeviceGroup deviceGroup = new DeviceGroup();
                deviceGroup.setCode(rs.getString("devicegroupcode"));
                deviceGroup.setName(rs.getString("name"));
                deviceGroup.setUsercode(rs.getString("usercode"));
                deviceGroups.add(deviceGroup);
            }
        }
        return deviceGroups;
    }
}
