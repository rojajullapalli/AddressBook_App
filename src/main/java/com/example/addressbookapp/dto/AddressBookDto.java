package com.example.addressbookapp.dto;

import lombok.Data;

@Data
public class AddressBookDto {
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public long pincode;
    public long phoneNumber;

    public AddressBookDto(String firstName, String lastName, String city, String state, long pincode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }
}
