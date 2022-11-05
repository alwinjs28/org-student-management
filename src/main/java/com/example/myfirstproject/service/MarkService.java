package com.example.myfirstproject.service;

import com.example.myfirstproject.dto.HighestMarkDto;
import com.example.myfirstproject.dto.ResultDto;
import com.example.myfirstproject.entity.Mark;

import javax.xml.transform.Result;
import java.util.List;

public interface MarkService {
    public Mark getMark(Long markId);
    public Mark save(Mark mark);
    public Mark update(Mark mark);
    public void delete(Mark mark);
    public Integer getTotalNumberOfStudentsPassed(Long examTypeId);
    public ResultDto getExamResult(Long examTypeId);
    public Integer getHighestMark(Long examTypeId);
    public HighestMarkDto getHighestMarkInAllSubject(Long examTypeId);
}
