package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.AddressBookData;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements AddressBookServiceInterface {

    private List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return addressBookDataList.stream()
                .filter(personData -> personData.getPersonId() == personId)
                .findFirst()
                .orElseThrow(() ->new AddressBookException("Person Contact Not Found"));
    }

    @Override
    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size()+1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookDataList.set(personId-1,addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int personId) {
        addressBookDataList.remove(personId-1);
    }
}
