package com.company;

import java.util.Date;

public class PersonalDetails {
    private final String title;
    private final String fullName;
    private final Date dateOfBirth;

    public PersonalDetails(String title, String fullName, Date dateOfBirth) {
        this.title = title;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getTitle() {
        return title;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }


}