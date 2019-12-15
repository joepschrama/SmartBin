package com.company.database.models;

public class Device
{
    private String devicecode;
    private String name;
    private String locationcode;
    private String garbagecode;

    public void setCode(String devicecode)
    {
        this.devicecode = devicecode;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLocationcode(String locationcode)
    {
        this.locationcode = locationcode;
    }

    public void setGarbagecode(String garbagecode)
    {
        this.garbagecode = garbagecode;
    }

    public String getName() {
        return this.name;
    }

    public String getLocationcode() {
        return this.locationcode;
    }

    public String getGarbagecode() {
        return this.garbagecode;
    }

    @Override
    public String toString() {
        return devicecode;
    }
}
