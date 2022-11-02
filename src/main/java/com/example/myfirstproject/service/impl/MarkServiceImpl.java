package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.entity.Mark;
import com.example.myfirstproject.repository.MarkRepository;
import com.example.myfirstproject.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    MarkRepository markRepository;
    public Mark getMark (Integer markId){
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
    public List<Mark> getAllMarks(){

    }
}
