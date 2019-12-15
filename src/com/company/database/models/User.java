package com.company.database.models;

public class User
{
    private String usercode;
    private String name;

    public void setCode(String usercode)
    {
        this.usercode = usercode;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
