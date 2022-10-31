package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee readEmployee(Long employeeId);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
