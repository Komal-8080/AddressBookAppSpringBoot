package com.bridgelabz.addressbookapp.dto;

import lombok.ToString;

import javax.validation.constraints.Pattern;

public @ToString class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First Name Invalid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last Name Invalid")
    public String lastName;

    public String address;

    public String city;

    public String state;

    public long zip;

    public String phone;

    public String email;

}
