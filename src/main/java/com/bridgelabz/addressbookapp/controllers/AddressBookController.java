package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{firstName}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("firstName") String firstName) {
        return new ResponseEntity<String>("Get Call Success for firstName: "+firstName, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created Address Book Data for: " +addressBookDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{firstName}")
    public ResponseEntity<String> updateAddressBookData(@PathVariable("firstName") String firstName ,@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated Address Book Data For: "+addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{firstName}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("firstName") String firstName) {
        return new ResponseEntity<String>("Delete Call Success for firstName: "+firstName, HttpStatus.OK);
    }

}
