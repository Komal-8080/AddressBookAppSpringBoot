package com.bridgelabz.addressbookapp.dto;

import java.awt.*;

public class AddressBookData {

    private String phone;
    private String firstName;
    private String lastName;

    public AddressBookData() { }

    public AddressBookData(String phone, AddressBookDTO addressBookDTO) {
        this.phone = phone;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
