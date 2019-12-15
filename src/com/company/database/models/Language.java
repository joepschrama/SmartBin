package com.company.database.models;

public class Language
{
    private String languagecode;
    private String description;

    public void setCode(String languagecode)
    {
        this.languagecode = languagecode;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return languagecode;
    }
}
