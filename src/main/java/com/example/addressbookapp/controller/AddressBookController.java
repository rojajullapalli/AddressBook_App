package com.example.addressbookapp.controller;

import com.example.addressbookapp.dto.AddressBookDto;
import com.example.addressbookapp.dto.ResponseDto;
import com.example.addressbookapp.model.AddressBook;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getAddressBook(){
        AddressBook addressBook = null;
        addressBook = new AddressBook(1,new AddressBookDto("roja","jullapalli","chennai","tamilnadu",602026,78786667));
        ResponseDto responseDto = new ResponseDto("Get Call Success",addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/get/{addrId}")
    public ResponseEntity<ResponseDto> getAddressBookDataById(@PathVariable(value="addrId") int addrId){
        AddressBook addressBook = null;
        addressBook = new AddressBook(1,new AddressBookDto("roja","jullapalli","chennai","tamilnadu",602026,78786667));
        ResponseDto responseDto = new ResponseDto("Get Call Success For Id",addressBook);
        return  new ResponseEntity<ResponseDto>( responseDto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addAddress(@RequestBody AddressBookDto addressBookDto){
        AddressBook addressBook = null;
        addressBook = new AddressBook(1,addressBookDto);
        ResponseDto responseDto = new ResponseDto("Added Address ",addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateAddress(@RequestBody AddressBookDto addressBookDto){
        AddressBook addressBook = null;
        addressBook = new AddressBook(1,addressBookDto);
        ResponseDto responseDto = new ResponseDto("updated Address ",addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addrId}")
    public ResponseEntity<ResponseDto> deleteAddress(@PathVariable(value="addrId") int addrId){
        ResponseDto responseDto = new ResponseDto("Deleted Successfully ","deleted Address Id "+addrId);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
}
