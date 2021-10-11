package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.model.AddressBook;

import java.util.List;

/**
 * interface to add business logic
 *
 * @author roja julapalli
 * @version 0.0.1
 * @since 10-10-2021
 */

public interface IAddressBook {

    /**
     * method for getting all the contacts from list
     *
     * @return list of contacts
     */

    List<AddressBook> getContactsData();

    /**
     * method to get employee by unique identifier
     *
     * @param addrId unique identifier for contact
     * @return contact by unique identifier
     */

    AddressBook getContactById(int addrId);

    /**
     * method to add contact data
     *
     * @param addressBookDto contact data as json as input
     * @return contact data will get added
     */

    AddressBook addContact(AddressBookDto addressBookDto);

    /**
     * method to update already existing data
     *
     * @param addrId         unique identifier for contact
     * @param addressBookDto contact data for updation
     * @return contact data will get updated based upon unique identifier
     */

    AddressBook UpdateContact(int addrId, AddressBookDto addressBookDto);

    /**
     * method to delete contact data by id
     *
     * @param addrId unique identifier of contact
     */

    void deleteContact(int addrId);
}
