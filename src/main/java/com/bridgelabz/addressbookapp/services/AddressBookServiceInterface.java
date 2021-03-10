package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.AddressBookData;

import java.util.List;

public interface AddressBookServiceInterface {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData addAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int personId);
}
