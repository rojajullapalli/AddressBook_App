package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * class implements all the methods of business logic from interface
 *
 * @author roja julapalli
 * @version 0.0.1
 * @since 10-10-2021
 */
@Service
public class AddressBookService implements IAddressBook {

    private final List<AddressBook> addressBookList = new ArrayList<>();

    @Override
    public List<AddressBook> getContactsData() {
        return addressBookList;
    }

    @Override
    public AddressBook getContactById(int addrId) {
        return addressBookList.get(addrId - 1);
    }

    @Override
    public AddressBook addContact(AddressBookDto addressBookDto) {
        AddressBook addressBook = null;
        addressBook = new AddressBook(addressBookList.size() + 1, addressBookDto);
        addressBookList.add(addressBook);
        return addressBook;
    }

    @Override
    public AddressBook UpdateContact(int addrId, AddressBookDto addressBookDto) {
        AddressBook addressBook = this.getContactById(addrId);
        addressBook.setFirstName(addressBookDto.getFirstName());
        addressBook.setLastName(addressBookDto.getLastName());
        addressBook.setCity(addressBookDto.getCity());
        addressBook.setState(addressBookDto.getState());
        addressBook.setPincode(addressBookDto.getPincode());
        addressBook.setPhoneNumber(addressBookDto.getPhoneNumber());
        addressBookList.set(addrId - 1, addressBook);
        return addressBook;
    }

    @Override
    public void deleteContact(int addrId) {
        addressBookList.remove(addrId - 1);
    }
}
