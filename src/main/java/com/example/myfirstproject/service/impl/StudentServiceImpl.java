package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.Student;
import com.example.myfirstproject.repository.StudentRepository;
import com.example.myfirstproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudent(Integer studentId) {
        return studentRepository.getStudent(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public List<String> searchNames(String word) {

        List<Student> students = studentRepository.getAllStudents();

        List<String> names = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);

            String name = student.getStudentName();
            if (name.toLowerCase().contains(word.toLowerCase())) {
                names.add(name);
            }
        }
        return names;
    }

    public List<Map> searchAges(Integer stuAge) {

        List<Student> students = studentRepository.getAllStudents();

        List<Map> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);

            String name = student.getStudentName();
            Integer age = student.getStudentAge();
            String bloodGroup = student.getStudentBloodGroup();

            if (stuAge == age) {
                Map details = new HashMap();
                details.put("name", name);
                details.put("age", age);
                details.put("bloodGroup", bloodGroup);
                result.add(details);
            }
        }
        return result;
    }

    public List<Student> searchAge(Integer studentAge) {
        List<Student> students = studentRepository.getAllStudents();
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            Integer age = student.getStudentAge();
            if (studentAge == age) {
                result.add(student);
            }
        }
        /*Student sut[] = new Student[result.size()];
        for (int i = 0; i < students.size(); i++) {
            sut[i] = students.get(i);
        }*/
        return result;
    }

}
