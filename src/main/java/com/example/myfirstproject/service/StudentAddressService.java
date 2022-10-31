package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.StudentAddress;

public interface StudentAddressService {
    StudentAddress createStuAddress(StudentAddress studentAddress);
    StudentAddress getStudentAddress(Integer studentAddressId);

}

