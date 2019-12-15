package com.company.database.models;

public class DeviceGroup
{
    private String devicegroupcode;
    private String name;
    private String usercode;

    public void setCode(String devicegroupcode)
    {
        this.devicegroupcode = devicegroupcode;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setUsercode(String usercode)
    {
        this.usercode = usercode;
    }

    public String getName() {
        return this.name;
    }

    public String getUsercode() {
        return this.usercode;
    }

    @Override
    public String toString() {
        return devicegroupcode;
    }
}
