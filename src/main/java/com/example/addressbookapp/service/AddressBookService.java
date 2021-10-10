package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressBookService implements IAddressBook{

    private List<AddressBook> addressBookList = new ArrayList<>();

    @Override
    public List<AddressBook> getAddressBookData() {
        return addressBookList;
    }

    @Override
    public AddressBook getAddressBookDataById(int addrId) {
        return addressBookList.get(addrId-1);
    }

    @Override
    public AddressBook addAddress(AddressBookDto addressBookDto) {
        AddressBook addressBook = null;
        addressBook = new AddressBook(addressBookList.size()+1,addressBookDto);
        addressBookList.add(addressBook);
        return addressBook;
    }

    @Override
    public AddressBook UpdateAddress(int addrId,AddressBookDto addressBookDto) {
        AddressBook addressBook = this.getAddressBookDataById(addrId);
        addressBook.setFirstName(addressBookDto.getFirstName());
        addressBook.setLastName(addressBookDto.getLastName());
        addressBook.setCity(addressBookDto.getCity());
        addressBook.setState(addressBookDto.getState());
        addressBook.setPincode(addressBookDto.getPincode());
        addressBook.setPhoneNumber(addressBookDto.getPhoneNumber());
        addressBookList.set(addrId-1,addressBook);
        return addressBook;
    }

    @Override
    public void deleteAddrees(int addrId) {
        addressBookList.remove(addrId-1);
    }
}
