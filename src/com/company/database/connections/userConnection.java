package com.company.database.connections;

import com.company.database.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class userConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//        List<User> users = new userConnection().list();
//
//        for (User user : users) {
//            System.out.println(user);
//        }
//    }

    public List<User> list() throws SQLException
    {
        List<User> users = new ArrayList<User>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from user");
        ) {
            while (rs.next()) {
                User user = new User();
                user.setCode(rs.getString("usercode"));
                user.setName(rs.getString("name"));
                users.add(user);
            }
        }
        return users;
    }

    public boolean loginAttempt(String username, String password) throws SQLException
    {
        boolean attempt = false;
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                //ResultSet rs=stmt.executeQuery("select * from user where name = '"+username+"' and password = '"+password+"'");
                ResultSet rs=stmt.executeQuery("select * from user where name = '"+username+"' and usercode = '"+password+"'");
        ) {
            if (rs.next()) {
                attempt = true;
            }
        }
        return attempt;
    }

    public User loginUser(String username, String password) throws SQLException
    {
        User user = new User();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                //ResultSet rs=stmt.executeQuery("select * from user where name = '"+username+"' and password = '"+password+"'");
                ResultSet rs=stmt.executeQuery("select * from user where name = '"+username+"' and usercode = '"+password+"'");
        ) {
            if (rs.next()) {
                user.setCode(rs.getString("usercode"));
                user.setName(rs.getString("name"));
            }
        }
        return user;
    }
}
