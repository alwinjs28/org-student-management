package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.Address;
import com.example.myfirstproject.repository.AddressRepository;
import com.example.myfirstproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address createAddress(Address address){
        return addressRepository.save(address);
    }

    public Address getAddress(Integer addressId){
        return addressRepository.getAddress(addressId);
    }
}
