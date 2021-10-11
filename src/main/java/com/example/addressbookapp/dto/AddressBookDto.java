package com.example.addressbookapp.dto;

import lombok.Data;
/**
 * creates and maintains employee payroll as object (DTO)
 *
 * @author roja julapalli
 * @version 0.0.1
 * @since 10-10-2021
 */
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
