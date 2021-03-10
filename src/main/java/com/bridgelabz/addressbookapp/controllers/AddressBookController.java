package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.AddressBookData;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.services.AddressBookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    public AddressBookServiceInterface addressBookServiceInterface;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressBookDataList = null;
        addressBookDataList = addressBookServiceInterface.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Sucess", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("personId") int personId) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookServiceInterface.getAddressBookDataById(personId);
        ResponseDTO respDTO = new ResponseDTO("Get Call Success for personId: "+personId, addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookServiceInterface.addAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO( "Created Address Book Data for: " +addressBookDTO,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId ,@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookServiceInterface.updateAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO( "Updated Address Book Data For: "+addressBookDTO,addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId") int personId) {
        addressBookServiceInterface.deleteAddressBookData(personId);
        ResponseDTO respDTO = new ResponseDTO("Delete Call Successfully"," Deleted: "+personId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

}
