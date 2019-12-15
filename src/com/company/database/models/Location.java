package com.company.database.models;

public class Location
{
    private String locationcode;
    private String name;
    private String devicegroupcode;

    public void setCode(String locationcode)
    {
        this.locationcode = locationcode;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDevicegroupcode(String devicegroupcode)
    {
        this.devicegroupcode = devicegroupcode;
    }

    public String getName() {
        return this.name;
    }

    public String getDevicegroupcode() {
        return this.devicegroupcode;
    }

    @Override
    public String toString() {
        return locationcode;
    }
}
