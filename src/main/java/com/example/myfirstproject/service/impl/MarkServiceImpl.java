package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.ExamType;
import com.example.myfirstproject.entity.Mark;
import com.example.myfirstproject.repository.ExamTypeRepository;
import com.example.myfirstproject.repository.MarkRepository;
import com.example.myfirstproject.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    ExamTypeRepository examTypeRepository;
    @Autowired
    MarkRepository markRepository;
    public Mark getMark (Long markId){
        return markRepository.getMark(markId);
    }
    public Mark save(Mark mark){
        return markRepository.save(mark);
    }
    public Mark update(Mark mark){
        return markRepository.save(mark);
    }
    public void delete(Mark mark){
        markRepository.delete(mark);
    }
    public Integer getTotalNumberOfStudentsPassed(Long examTypeId){
       List<Mark> marks = markRepository.getTotalNumberOfStudentsPassed(examTypeId);
        ExamType examType = examTypeRepository.getExamType(examTypeId);
       Integer count=0;
       for (int i=0;i<marks.size();i++){
           Mark mark = marks.get(i);

           Integer passMark = examType.getPassMark();

           Integer tamil = mark.getTamilMark();
           Integer english = mark.getEnglishMark();
           Integer maths = mark.getMathsMark();
           Integer science = mark.getScienceMark();
           Integer socialScience = mark.getSocialScienceMark();

           if(tamil>=passMark && english>=passMark && maths>=passMark && science>=passMark &&socialScience>=passMark){
               count++;
           }
       }
       return count;
    }
}
