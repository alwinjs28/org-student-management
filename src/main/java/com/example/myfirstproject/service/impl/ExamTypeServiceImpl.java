package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.ExamType;
import com.example.myfirstproject.repository.ExamTypeRepository;
import com.example.myfirstproject.service.ExamTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamTypeServiceImpl implements ExamTypeService {
    @Autowired
    ExamTypeRepository examTypeRepository;
    @Override
    public ExamType getExamType(Long examTypeId) {
        return examTypeRepository.getExamType(examTypeId);
    }

    @Override
    public ExamType save(ExamType examType) {
        return examTypeRepository.save(examType);
    }

    @Override
    public ExamType update(ExamType examType) {
        return examTypeRepository.save(examType);
    }

    @Override
    public void delete(ExamType examType) {
         examTypeRepository.delete(examType);
    }

}
