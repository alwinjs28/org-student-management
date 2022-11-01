package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.Mark;
import com.example.myfirstproject.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkServiceImpl {
    @Autowired
    MarkRepository markRepository;
    public Mark getMark (Integer markId){
        return markRepository.getMark(markId);
    }
}
