package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Address;

public interface AddressService {
    Address createAddress(Address address);
    Address getAddress(Integer addressId);
}
