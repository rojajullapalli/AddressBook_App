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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getAddressBookData(){
        List<AddressBook> addressBook = null;
        addressBook = addressBookService.getAddressBookData();
        ResponseDto responseDto = new ResponseDto("Get Call Success",addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/get/{addrId}")
    public ResponseEntity<ResponseDto> getAddressBookDataById(@PathVariable(value="addrId") int addrId){
        AddressBook addressBook = null;
        addressBook = addressBookService.getAddressBookDataById(addrId);
        ResponseDto responseDto = new ResponseDto("Get Call Success For Id",addressBook);
        return  new ResponseEntity<ResponseDto>( responseDto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addAddress(@RequestBody AddressBookDto addressBookDto){
        AddressBook addressBook = null;
        addressBook = addressBookService.addAddress(addressBookDto);
        ResponseDto responseDto = new ResponseDto("Added Address ",addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @PutMapping("/update/{addrId}")
    public ResponseEntity<ResponseDto> updateAddress(@PathVariable(value="addrId") int addrId,@RequestBody AddressBookDto addressBookDto){
        AddressBook addressBook = null;
        addressBook = addressBookService.UpdateAddress(addrId,addressBookDto);
        ResponseDto responseDto = new ResponseDto("updated Address ",addressBook);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addrId}")
    public ResponseEntity<ResponseDto> deleteAddress(@PathVariable(value="addrId") int addrId){
        addressBookService.deleteAddrees(addrId);
        ResponseDto responseDto = new ResponseDto("Deleted Successfully ","deleted Address Id "+addrId);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
}
