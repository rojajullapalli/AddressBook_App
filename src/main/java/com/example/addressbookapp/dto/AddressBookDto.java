package com.example.addressbookapp.dto;

import lombok.Data;

@Data
public class AddressBookDto {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String pincode;
    private String phoneNumber;
}
