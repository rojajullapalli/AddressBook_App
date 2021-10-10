package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.model.AddressBook;

import java.util.List;

public interface IAddressBook {
    List<AddressBook> getAddressBookData();

    AddressBook getAddressBookDataById(int addrId);

    AddressBook addAddress(AddressBookDto addressBookDto);

    AddressBook UpdateAddress(AddressBookDto addressBookDto);

    void deleteAddrees(int addrId);
}
