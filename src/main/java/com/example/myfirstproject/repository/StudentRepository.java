package com.example.myfirstproject.repository;

import com.example.myfirstproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value="SELECT S FROM Student S  WHERE S.studentId=?1")
    Student getStudent(Integer studentId);

    @Query(value ="SELECT S FROM Student S" )
    List<Student> getAllStudents();

}
