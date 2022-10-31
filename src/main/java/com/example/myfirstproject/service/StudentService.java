package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudent(Integer studentId);
    List<Student> getAllStudents();

    List<String> searchNames(String word);

    List<Map> searchAges(Integer stuAge);

    List<Student> searchAge(Integer studentAge);
}
