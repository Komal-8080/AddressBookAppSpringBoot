package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements AddressBookServiceInterface {


    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Sudhir", "Shinde")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Sudhir","Shinde"));
        return addressBookData;
    }

    @Override
    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int personId) {
    }
}
