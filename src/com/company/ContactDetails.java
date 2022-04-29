package com.company;

/*This class is responsible for keeping
 * track of telephone number, work phone and email */
public class ContactDetails {
    private final String telephone;
    private final String workPhone;
    private final String email;

    public ContactDetails(String telephone, String workPhone, String email) {
        this.telephone = telephone;
        this.workPhone = workPhone;
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getEmail() {
        return email;
    }


}