package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Mark;

import java.util.List;

public interface MarkService {
    public Mark getMark(Long markId);
    public Mark save(Mark mark);
    public Mark update(Mark mark);
    public void delete(Mark mark);
    public Integer getTotalNumberOfStudentsPassed(Long examTypeId);
}
