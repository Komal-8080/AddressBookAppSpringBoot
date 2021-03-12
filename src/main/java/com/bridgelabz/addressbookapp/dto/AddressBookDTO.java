package com.bridgelabz.addressbookapp.dto;

import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public @ToString class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First Name Invalid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last Name Invalid")
    public String lastName;

    @NotBlank(message = "Notes cannot be empty")
    public String address;

    @NotBlank(message = "Notes cannot be empty")
    public String city;

    @NotBlank(message = "Notes cannot be empty")
    public String state;

    @Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$", message = "Invalid ZipCode")
    public String zip;

    @Pattern(regexp = "^([+][9][1]|[9][1]){0,1}([0-9]{1}[0-9]{9})$", message = "Invalid Phone Number")
    public String phone;

    @Pattern(regexp = "^([a-zA-a0-9\\.\\-\\+]+)@([a-zA-Z0-9\\.]{1,5})([a-zA-Z\\.]+){1,3}([a-zA-Z]{1,3})$", message = "Invalid Email Id")
    public String email;

}
