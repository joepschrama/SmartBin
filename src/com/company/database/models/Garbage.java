package com.company.database.models;

public class Garbage
{
    private String garbagecode;
    private String weekly_usage;
    private String monthly_usage;
    private String yearly_usage;
    private String weekly_usage_old;

    public void setCode(String garbagecode)
    {
        this.garbagecode = garbagecode;
    }

    public void setWeeklyUsage(String weekly_usage)
    {
        this.weekly_usage = weekly_usage;
    }

    public void setMonthlyUsage(String monthly_usage)
    {
        this.monthly_usage = monthly_usage;
    }

    public void setYearlyUsage(String yearly_usage)
    {
        this.yearly_usage = yearly_usage;
    }

    public void setWeeklyUsageOld(String weekly_usage_old)
    {
        this.weekly_usage_old = weekly_usage_old;
    }

    public String getWeeklyUsage() {
        return this.weekly_usage;
    }

    public String getMonthlyUsage() {
        return this.monthly_usage;
    }

    public String getYearlyUsage() {
        return this.yearly_usage;
    }

    public String getWeeklyUsageOld() {
        return this.weekly_usage_old;
    }

    @Override
    public String toString() {
        return garbagecode;
    }
}
