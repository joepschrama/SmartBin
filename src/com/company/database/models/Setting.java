package com.company.database.models;

public class Setting
{
    private String settingcode;
    private String version;
    private Boolean notifications;
    private String languagecode;
    private String usercode;


    public void setCode(String settingcode)
    {
        this.settingcode = settingcode;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public void setNotifications(Boolean notifications)
    {
        this.notifications = notifications;
    }

    public void setLanguagecode(String languagecode)
    {
        this.languagecode = languagecode;
    }

    public void setUsercode(String usercode)
    {
        this.usercode = usercode;
    }

    public String getVersion() {
        return this.version;
    }

    public Boolean getNotifications() {
        return this.notifications;
    }

    public String getLanguagecode() {
        return this.languagecode;
    }

    public String getUsercode() {
        return this.usercode;
    }

    @Override
    public String toString() {
        return settingcode;
    }
}
