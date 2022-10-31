package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Employee;
import com.example.myfirstproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path="employee")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/create-employee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.createEmployee(employee);
    }

    @RequestMapping(value="/read-employee", method = RequestMethod.GET)
    public Employee readEmployee(@RequestParam(name="empId") Long employeeId)
    {
        return employeeService.readEmployee(employeeId);
    }

    @RequestMapping(value="/update-employee", method = RequestMethod.PUT)
    public Employee updateEmployee(@RequestBody Employee employee)
    {

        return employeeService.updateEmployee(employee);
    }

    @RequestMapping(value="/delete-employee", method = RequestMethod.DELETE)
    public void deleteEmployee(@RequestBody Employee employee)
    {
        employeeService.deleteEmployee(employee);
    }
}
