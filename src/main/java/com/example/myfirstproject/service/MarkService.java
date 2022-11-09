package com.example.myfirstproject.service;

import com.example.myfirstproject.dto.SubjectMarksDto;
import com.example.myfirstproject.dto.ResultDto;
import com.example.myfirstproject.entity.Mark;

public interface MarkService {
    public Mark getMark(Long markId);
    public Mark save(Mark mark);
    public Mark update(Mark mark);
    public void delete(Mark mark);
    public Integer getTotalNumberOfStudentsPassed(Long examTypeId);
    public ResultDto getExamResult(Long examTypeId);
    public Integer getHighestMark(Long examTypeId);
    public SubjectMarksDto getHighestMarkInAllSubject(Long examTypeId);
    public SubjectMarksDto getLowestMarkInEachSubject(Long examTypeId);
}
