package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.AddressBookData;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData("9030639350", new AddressBookDTO("Komal","Shinde"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Sucess", addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{firstName}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("firstName") String firstName) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData("9030639350", new AddressBookDTO("Komal","Shinde"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success for firstName: "+firstName, addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData("9030639350", addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO( "Created Address Book Data for: " +addressBookDTO,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{firstName}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("firstName") String firstName ,@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(firstName, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO( "Updated Address Book Data For: "+addressBookDTO,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{firstName}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("firstName") String firstName) {
        ResponseDTO respDTO = new ResponseDTO("Delete Call Successfully"," Deleted: "+firstName);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

}
