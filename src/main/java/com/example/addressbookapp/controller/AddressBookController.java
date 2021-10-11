package com.example.addressbookapp.controller;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.dto.ResponseDto;
import com.example.addressbookapp.model.AddressBook;
import com.example.addressbookapp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Performed Various HTTP Request(GET,PUT,POST,DELETE)
 *
 * @author roja julapalli
 * @version 0.0.1
 * @since 10-10-2021
 */

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    /**
     * Function to perform Http Get request
     *
     * @return List of contacts from addressbook
     */

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getContactsData() {
        List<AddressBook> addressBook = null;
        addressBook = addressBookService.getContactsData();
        ResponseDto responseDto = new ResponseDto("Get Call Success", addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    /**
     * Function to perform Http Get request
     *
     * @param addrId unique identifier to find contact
     * @return contact using unique identifier
     */

    @GetMapping("/get/{addrId}")
    public ResponseEntity<ResponseDto> getContactByIdId(@PathVariable(value = "addrId") int addrId) {
        AddressBook addressBook = null;
        addressBook = addressBookService.getContactById(addrId);
        ResponseDto responseDto = new ResponseDto("Get Call Success For Id", addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    /**
     * Function to perform Http Post request
     *
     * @param addressBookDto contact info data in the form of Json
     * @return add the contact to addressbook
     */

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addContact(@RequestBody AddressBookDto addressBookDto) {
        AddressBook addressBook = null;
        addressBook = addressBookService.addContact(addressBookDto);
        ResponseDto responseDto = new ResponseDto("Added Address ", addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    /**
     * Function to perform Http Put request
     *
     * @param addrId unique identifier of contact
     * @param addressBookDto contact data in addressbook
     * @return update contact data by using unique id
     */

    @PutMapping("/update/{addrId}")
    public ResponseEntity<ResponseDto> updateContact(@PathVariable(value = "addrId") int addrId, @RequestBody AddressBookDto addressBookDto) {
        AddressBook addressBook = null;
        addressBook = addressBookService.UpdateContact(addrId, addressBookDto);
        ResponseDto responseDto = new ResponseDto("updated Address ", addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    /**
     * Function to perform Http Delete request
     *
     * @param addrId unique identifier of contact
     * @return {@ResponseEntity} with message
     */

    @DeleteMapping("/delete/{addrId}")
    public ResponseEntity<ResponseDto> deleteContact(@PathVariable(value = "addrId") int addrId) {
        addressBookService.deleteContact(addrId);
        ResponseDto responseDto = new ResponseDto("Deleted Successfully ", "deleted Address Id " + addrId);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
}
