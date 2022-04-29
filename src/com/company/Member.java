package com.company;

import java.math.BigDecimal;
import java.util.Date;

/*This class is responsible for keeping track of
 * personal details, address, contact details,payment, date joined, and whether existing
 * or new member  */

public class Member {

    private Payment payment;
    private PersonalDetails person;
    private AddressDetails address;
    private ContactDetails contact;
    private Date dateJoined;
    private boolean existing;
    private String membershipId;
    private HealthCommitmentConsent healthCommitmentConsent;


    // gets annual/total or monthly payment
    public String getPayment() {
        payment = new Payment();
        payment.setAmount(BigDecimal.valueOf(600));
        payment.setPaymentMethod("monthly");

        if (payment.getPaymentMethod() != "monthly") {
            return "payment method annually, payment due is " + payment.getAmount();
        } else {
            Monthly monthly = new Monthly();
            return "payment method: monthly, payment due is " + monthly.calculateMonthlyPayment();
        }
    }

    // check if a member is a student
    public String isAStudent() {
        StudentMembership studentMembership = new StudentMembership(true, new Date(), 30);
        if (studentMembership.isLetterReceived() == true) {
            return "is a student: yes, letter received, student hours: " + studentMembership.getStudentHours() + ", date letter received " + studentMembership.getDateLetterReceived();
        } else {
            return "not a student ";
        }
    }

// get address details

    public AddressDetails getAddress() {
        address = new AddressDetails(10, "downing", "ab6 5bc");
        return address;
    }

// get contact details

    public ContactDetails getContact() {
        contact = new ContactDetails("002323300", "1212", "00000.com");
        return contact;
    }

// get personal details

    public PersonalDetails getPerson() {
        person = new PersonalDetails("mr", "aaa bbb ccc ", new Date(1900, 1, 1));
        return person;
    }

    //  is existing or new
    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    // date joined

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    // health commitment consent check

    public HealthCommitmentConsent getHealthCommitmentConsent() {
        return healthCommitmentConsent;
    }

    public void setHealthCommitmentConsent(HealthCommitmentConsent healthCommitmentConsent) {
        this.healthCommitmentConsent = healthCommitmentConsent;
    }
    // membership id

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

}
