package com.example.myfirstproject.repository;

import com.example.myfirstproject.entity.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, Integer> {

    @Query(value="SELECT SA FROM StudentAddress SA WHERE SA.studentAddressId=?1")
    StudentAddress getStudentAddress(Integer studentAddressId);
}
