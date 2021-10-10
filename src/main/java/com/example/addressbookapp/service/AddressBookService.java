package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressBookService implements IAddressBook{

    @Override
    public List<AddressBook> getAddressBookData() {
        List<AddressBook> addressBookList = new ArrayList<>();
        addressBookList.add(new AddressBook(1,new AddressBookDto("roja","jullapalli","chennai","tamilnadu",602026,78786667)));
        return addressBookList;
    }

    @Override
    public AddressBook getAddressBookDataById(int addrId) {
       AddressBook addressBook = null;
       addressBook = new AddressBook(1,new AddressBookDto("roja","jullapalli","chennai","tamilnadu",602026,78786667));
        return addressBook;
    }

    @Override
    public AddressBook addAddress(AddressBookDto addressBookDto) {
        AddressBook addressBook = null;
        addressBook = new AddressBook(1,addressBookDto);
        return addressBook;
    }

    @Override
    public AddressBook UpdateAddress(AddressBookDto addressBookDto) {
        AddressBook addressBook = null;
        addressBook = new AddressBook(1,addressBookDto);
        return addressBook;
    }

    @Override
    public void deleteAddrees(int addrId) {

    }
}
