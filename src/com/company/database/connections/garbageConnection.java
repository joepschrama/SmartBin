package com.company.database.connections;

import com.company.database.models.Device;
import com.company.database.models.Garbage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class garbageConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//        //List<Garbage> garbages = new garbageConnection().list();
//
//        for (Garbage garbage : garbages) {
//            System.out.println(garbage);
//        }
//    }

    public List<Garbage> list() throws SQLException
    {
        List<Garbage> garbages = new ArrayList<Garbage>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from garbage");
        ) {
            while (rs.next()) {
                Garbage garbage = new Garbage();
                garbage.setCode(rs.getString("garbagecode"));
                garbage.setWeeklyUsage(rs.getString("weekly_usage"));
                garbage.setMonthlyUsage(rs.getString("monthly_usage"));
                garbage.setYearlyUsage(rs.getString("yearly_usage"));
                garbage.setWeeklyUsageOld(rs.getString("weekly_usage_old"));
                garbages.add(garbage);
            }
        }
        return garbages;
    }

    public static Garbage deviceGarbage(Device devicecode) throws SQLException
    {
        Garbage garbage = new Garbage();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rsDevice=stmt.executeQuery("select * from device where devicecode='"+devicecode+"'");
        ) {
            if(rsDevice.next()) {
                String code = rsDevice.getString("garbagecode");
                ResultSet rs=stmt.executeQuery("select * from garbage where garbagecode='"+code+"'");
                if (rs.next()) {
                    garbage.setCode(rs.getString("garbagecode"));
                    garbage.setWeeklyUsage(rs.getString("weekly_usage"));
                    garbage.setMonthlyUsage(rs.getString("monthly_usage"));
                    garbage.setYearlyUsage(rs.getString("yearly_usage"));
                    garbage.setWeeklyUsageOld(rs.getString("weekly_usage_old"));
                }
            }
        }
        return garbage;
    }
}
