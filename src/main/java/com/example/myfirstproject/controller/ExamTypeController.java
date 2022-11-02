package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.ExamType;
import com.example.myfirstproject.service.ExamTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "examType")
@RestController
public class ExamTypeController {
    @Autowired
    ExamTypeService examTypeService;

    @RequestMapping(value = "/g_exam",method = RequestMethod.GET)
    public ExamType getExamType(@RequestParam("id")Long examTypeId){
        return examTypeService.getExamType(examTypeId);
    }
    @RequestMapping(value = "/s_exam",method = RequestMethod.POST)
    public ExamType save(@RequestBody ExamType examType){
        return examTypeService.save(examType);
    }
    @RequestMapping(value = "/u_exam",method = RequestMethod.PUT)
    public ExamType update(@RequestBody ExamType examType){
        return examTypeService.update(examType);
    }
    @RequestMapping(value = "/d_exam",method = RequestMethod.DELETE)
    public void delete(@RequestBody ExamType examType){
        examTypeService.delete(examType);
    }
}
