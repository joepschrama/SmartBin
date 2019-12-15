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
}
