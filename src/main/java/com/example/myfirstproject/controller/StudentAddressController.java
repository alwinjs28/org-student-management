package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.StudentAddress;
import com.example.myfirstproject.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "StudentAddress")
@RestController
public class StudentAddressController {

    @Autowired
    StudentAddressService studentAddressService;

    @RequestMapping(value = "/create_stu_address",method = RequestMethod.POST)
    public StudentAddress createStuAddress(@RequestBody StudentAddress studentAddress){
        return studentAddressService.createStuAddress(studentAddress);
    }

    @RequestMapping(value = "/g-stu_ad",method = RequestMethod.GET)
    public StudentAddress getStudentAddress(@RequestParam("id") Integer studentAddressId){
        return studentAddressService.getStudentAddress(studentAddressId);
    }
}
