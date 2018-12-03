package com.telRan.ashkelon;

public class ContactData {
    private final String fName;
    private final String lName;
    private final String address;
    private final String email;
    private final String phoneHome;

    public ContactData(String fName, String lName, String address, String email, String phoneHome) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.email = email;
        this.phoneHome = phoneHome;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneHome() {
        return phoneHome;
    }
}
