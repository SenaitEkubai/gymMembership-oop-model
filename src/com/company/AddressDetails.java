package com.company;

/*this class is responsible for keeping tracks
 of house number, street name and postcode
 */
public class AddressDetails {
    int houseNumber;
    String streetName;
    String postCode;
    public String test;


    public AddressDetails(int houseNumber, String streetName, String postCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.postCode = postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }


}
