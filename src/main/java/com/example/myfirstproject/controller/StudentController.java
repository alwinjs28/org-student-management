package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Student;
import com.example.myfirstproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequestMapping(path="student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/create_student",method = RequestMethod.POST)
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @RequestMapping(value ="g_student",method = RequestMethod.GET)
    public Student getStudent(@RequestParam ("id")Integer studentId){
        return studentService.getStudent(studentId);
    }

    @RequestMapping(value = "g_stu_all",method = RequestMethod.GET)
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }

//    @RequestMapping(value = "search_name",method = RequestMethod.GET)
    public List<String> getStudentsNames(@RequestParam ("name") String searchName){
        List<Student> students =  studentService.getAllStudents();
        List<String>names = new ArrayList<>();

        for (int i=0;i<students.size();i++){
            Student student =students.get(i);

            String name = student.getStudentName();
            if(name.toLowerCase().contains(searchName.toLowerCase())){
                names.add(name);
            }
        }
        return names;
    }

    @RequestMapping(value = "search_name",method = RequestMethod.GET)
    public List<String> searchNames(@RequestParam ("word") String word) {
        return studentService.searchNames(word);
    }
    @RequestMapping(value = "search_age",method = RequestMethod.GET)
    public List<Map> searchAges(@RequestParam ("stuAge") Integer stuAge){
        return studentService.searchAges(stuAge);
    }
    @RequestMapping(value = "search_age_new",method = RequestMethod.GET)
    public List<Student> searchAgeNew(@RequestParam ("stuAge") Integer stuAge){
        return studentService.searchAge(stuAge);
    }

}
