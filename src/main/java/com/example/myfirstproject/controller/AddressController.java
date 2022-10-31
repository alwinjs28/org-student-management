package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Address;
import com.example.myfirstproject.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "address")
@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/creat_adress",method = RequestMethod.POST)
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    @RequestMapping(value = "/g_address",method = RequestMethod.GET)
    public Address getAddress(@RequestParam ("id")Integer addressId ){
        return addressService.getAddress(addressId);
    }
}
