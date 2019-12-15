package com.company.database.models;

public class Notification
{
    private String notificationcode;
    private String timestamp;
    private String description;
    private String devicecode;

    public void setCode(String notificationcode)
    {
        this.notificationcode = notificationcode;
    }

    public void setTimestamp(String timestamp)
    {
        this.timestamp = timestamp;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDevicecode(String devicecode)
    {
        this.devicecode = devicecode;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDevicecode() {
        return this.devicecode;
    }


    @Override
    public String toString() {
        return notificationcode;
    }
}
