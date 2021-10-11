package com.example.addressbookapp.model;

import com.example.addressbookapp.dto.AddressBookDto;
import lombok.Data;
/**
 * Receive data Object
 *
 * @author roja julapalli
 * @version 0.0.1
 * @since 10-10-2021
 */
@Data
public class AddressBook {
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private long pincode;
    private long phoneNumber;


    public AddressBook(int id, AddressBookDto addressBookDto) {
        this.id = id;
        this.firstName = addressBookDto.firstName;
        this.lastName = addressBookDto.lastName;
        this.city = addressBookDto.city;
        this.state = addressBookDto.state;
        this.pincode = addressBookDto.pincode;
        this.phoneNumber = addressBookDto.phoneNumber;
    }
}
