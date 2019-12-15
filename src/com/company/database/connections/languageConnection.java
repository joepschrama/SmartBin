package com.company.database.connections;

import com.company.database.models.Language;
import com.company.database.models.Setting;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class languageConnection
{
//    public static void main(String[] args) throws SQLException
//    {
//        List<Language> languages = new languageConnection().list();
//
//        for (Language language : languages) {
//            System.out.println(language);
//        }
//    }

    public List<Language> list() throws SQLException
    {
        List<Language> languages = new ArrayList<Language>();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from language");
        ) {
            while (rs.next()) {
                Language language = new Language();
                language.setCode(rs.getString("languagecode"));
                language.setDescription(rs.getString("description"));
                languages.add(language);
            }
        }
        return languages;
    }

    public static Language settingLanguage(Setting settingcode) throws SQLException
    {
        Language language = new Language();
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartbin", "root", "root");
                Statement stmt=con.createStatement();
                ResultSet rsSetting=stmt.executeQuery("select * from setting where settingcode='"+settingcode+"'");
        ) {
            if (rsSetting.next()) {
                String code = rsSetting.getString("languagecode");
                ResultSet rs=stmt.executeQuery("select * from language where languagecode='"+code+"'");
                if (rs.next()) {
                    language.setCode(rs.getString("languagecode"));
                    language.setDescription(rs.getString("description"));
                }
            }
        }
        return language;
    }
}
