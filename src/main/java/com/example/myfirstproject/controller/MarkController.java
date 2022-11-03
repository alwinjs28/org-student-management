package com.example.myfirstproject.controller;

import com.example.myfirstproject.entity.Mark;
import com.example.myfirstproject.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "mark")
@RestController
public class MarkController {
    @Autowired
    MarkService markService;

    @RequestMapping(value = "/g_mark",method = RequestMethod.GET)
    public Mark getMark(@RequestParam("id")Long markId){
        return markService.getMark(markId);
    }
    @RequestMapping(value = "/s_mark",method = RequestMethod.POST)
    public Mark save(@RequestBody Mark mark){
        return markService.save(mark);
    }
    @RequestMapping(value = "/u_mark",method = RequestMethod.PUT)
    public Mark update(@RequestBody Mark mark){
        return markService.update(mark);
    }
    @RequestMapping(value = "/d_mark",method = RequestMethod.DELETE)
    public void delete(@RequestBody Mark mark){
        markService.delete(mark);
    }
    @RequestMapping(value = "/noOfStudentPass",method = RequestMethod.GET)
    public Integer getTotalNumberOfStudentsPassed(@RequestParam("id")Long examTypeId){
        return markService.getTotalNumberOfStudentsPassed(examTypeId);
    }
}
