package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.StudentAddress;
import com.example.myfirstproject.repository.StudentAddressRepository;
import com.example.myfirstproject.service.StudentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentAddressServiceImpl implements StudentAddressService {

    @Autowired
    StudentAddressRepository studentAddressRepository;
    public StudentAddress createStuAddress(StudentAddress studentAddress){
        return studentAddressRepository.save(studentAddress);
    }

    public StudentAddress getStudentAddress(Integer studentAddressId){
        return studentAddressRepository.getStudentAddress(studentAddressId);
    }
}
