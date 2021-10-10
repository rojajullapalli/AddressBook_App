package com.example.addressbookapp.controller;

import com.example.addressbookapp.dto.AddressBookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/get")
    public ResponseEntity<String> getAddressBook(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{addrId}")
    public ResponseEntity<String> getAddressBookDataById(@PathVariable(value="addrId") int addrId){
        return  new ResponseEntity<>("Get Call Success For Id " +addrId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddress(@RequestBody AddressBookDto addressBookDto){
        return new ResponseEntity<String>("Created Employee Payroll Data For "+addressBookDto, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddress(@RequestBody AddressBookDto addressBookDto){
        return new ResponseEntity<String>("Update Employee Payroll Data For "+addressBookDto, HttpStatus.OK );
    }

    @DeleteMapping("/delete/{addrId}")
    public ResponseEntity<String> deleteAddress(@PathVariable(value="addrId") int addrId){
        return new ResponseEntity<String>("Delete Call Success For Id "+addrId, HttpStatus.OK);
    }
}
