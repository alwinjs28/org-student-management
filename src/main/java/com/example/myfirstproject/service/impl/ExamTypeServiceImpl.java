package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.ExamType;
import com.example.myfirstproject.repository.ExamTypeRepository;
import com.example.myfirstproject.service.ExamTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExamTypeServiceImpl implements ExamTypeService {
    @Autowired
    ExamTypeRepository examTypeRepository;
    @Override
    public ExamType getExamType(Long examTypeId) {
        log.info("The received input exam type id : " + examTypeId);
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
