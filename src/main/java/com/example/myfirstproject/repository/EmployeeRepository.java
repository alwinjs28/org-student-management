package com.example.myfirstproject.repository;

import com.example.myfirstproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT emp from Employee emp where emp.employeeId = ?1")
    Employee readEmployee(Long employeeId);

}
