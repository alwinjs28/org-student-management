package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.Employee;
import com.example.myfirstproject.repository.EmployeeRepository;
import com.example.myfirstproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee readEmployee(Long employeeId) {
        return employeeRepository.readEmployee(employeeId);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
//        JSONObject j;
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {

        employeeRepository.delete(employee);
    }

}
