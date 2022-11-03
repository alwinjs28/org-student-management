package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.ExamType;

public interface ExamTypeService {
     ExamType getExamType(Long examTypeId);
     ExamType save(ExamType examType);
     ExamType update(ExamType examType);
     void delete(ExamType examType);
}
