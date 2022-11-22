package com.example.myfirstproject.service.impl;

import com.example.myfirstproject.dto.MarksAndStudentDto;
import com.example.myfirstproject.dto.StudentReportDto;
import com.example.myfirstproject.dto.SubjectMarksDto;
import com.example.myfirstproject.dto.ResultDto;
import com.example.myfirstproject.entity.ExamType;
import com.example.myfirstproject.entity.Mark;
import com.example.myfirstproject.entity.Student;
import com.example.myfirstproject.repository.ExamTypeRepository;
import com.example.myfirstproject.repository.MarkRepository;
import com.example.myfirstproject.repository.StudentRepository;
import com.example.myfirstproject.service.MarkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class  MarkServiceImpl implements MarkService {
    @Autowired
    ExamTypeRepository examTypeRepository;
    @Autowired
    MarkRepository markRepository;
    @Autowired
    StudentRepository studentRepository;
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
       List<Mark> marks = markRepository.getMarksByExamTypeId(examTypeId);
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
    public ResultDto getExamResult(Long examTypeId){
        List<Mark> marks = markRepository.getMarksByExamTypeId(examTypeId);
       Integer noOfStudentsPassed = getTotalNumberOfStudentsPassed(examTypeId);
       Integer noOfStudentFailed = marks.size()-noOfStudentsPassed;

        ResultDto resultDto = new ResultDto();
        resultDto.setStudentFailed(noOfStudentFailed);
        resultDto.setStudentPassed(noOfStudentsPassed);

        return resultDto;
    }
    public Integer getHighestMark(Long examTypeId){
        List<Mark> marks = markRepository.getMarksByExamTypeId(examTypeId);
        ExamType examType = examTypeRepository.getExamType(examTypeId);
        Integer highestTotal = 0;
        for (int i=0;i<marks.size();i++){
            Mark mark = marks.get(i);

            Integer passMark = examType.getPassMark();

            Integer tamil = mark.getTamilMark();
            Integer english = mark.getEnglishMark();
            Integer maths = mark.getMathsMark();
            Integer science = mark.getScienceMark();
            Integer socialScience = mark.getSocialScienceMark();

            if(tamil>=passMark && english>=passMark && maths>=passMark && science>=passMark &&socialScience>=passMark){
                  int total = tamil+english+maths+science+socialScience;
                  if(total>highestTotal){
                      highestTotal = total;
                  }
            }
        }
        return highestTotal;
    }
    public SubjectMarksDto getHighestMarkInAllSubject(Long examTypeId){
        List<Mark> marks = markRepository.getMarksByExamTypeId(examTypeId);
        SubjectMarksDto subjectMarksDto = new SubjectMarksDto();
        Integer highMarkTamil = 0;
        Integer highMarkEnglish = 0;
        Integer highMarkMaths = 0;
        Integer highMarkScience = 0;
        Integer highMarkSocialScience = 0;
        for (int i=0;i<marks.size();i++) {
            Mark mark = marks.get(i);

            Integer tamil = mark.getTamilMark();
            Integer english = mark.getEnglishMark();
            Integer maths = mark.getMathsMark();
            Integer science = mark.getScienceMark();
            Integer socialScience = mark.getSocialScienceMark();

            if (tamil > highMarkTamil ) {
                highMarkTamil = tamil;
                subjectMarksDto.setTamil(tamil);
            }
            if(english > highMarkEnglish){
                highMarkEnglish = english;
                subjectMarksDto.setEnglish(english);
            }
            if(maths > highMarkMaths){
                highMarkMaths = maths;
                subjectMarksDto.setMaths(maths);
            }
            if(science > highMarkScience){
                highMarkScience = science;
                subjectMarksDto.setScience(science);
            }
            if(socialScience > highMarkSocialScience){
                highMarkSocialScience = socialScience;
                subjectMarksDto.setSocialScience(socialScience);
            }

        }
         return subjectMarksDto;
    }
    public SubjectMarksDto getLowestMarkInEachSubject(Long examTypeId){
        List<Mark> marks =markRepository.getMarksByExamTypeId(examTypeId);

        SubjectMarksDto subjectMarksDto = new SubjectMarksDto();
        Integer lowestMarkTamil = 100;
        Integer lowestMarkEnglish = 100;
        Integer lowestMarkMath = 100;
        Integer lowestMarkScience = 100;
        Integer lowestMarkSocialScience = 100;

        for (int i=0;i<marks.size();i++){
            Mark mark = marks.get(i);

            Integer tamil = mark.getTamilMark();
            Integer english = mark.getEnglishMark();
            Integer maths = mark.getMathsMark();
            Integer science = mark.getScienceMark();
            Integer socialScience = mark.getSocialScienceMark();

            if(tamil<lowestMarkTamil){
                lowestMarkTamil = tamil;
                subjectMarksDto.setTamil(tamil);
            }
            if (english<lowestMarkEnglish){
                lowestMarkEnglish = english;
                subjectMarksDto.setEnglish(english);
            }
            if (maths<lowestMarkMath){
                lowestMarkMath = maths;
                subjectMarksDto.setMaths(maths);
            }
            if (science<lowestMarkScience){
                lowestMarkScience = science;
                subjectMarksDto.setScience(science);
            }
            if (socialScience<lowestMarkSocialScience){
                lowestMarkSocialScience = socialScience;
                subjectMarksDto.setSocialScience(socialScience);
            }
        }
        return subjectMarksDto;
    }
    public MarksAndStudentDto getHighestMarkAndStudentName(Long examTypeId) {
        List<Mark> marks = markRepository.getMarksByExamTypeId(examTypeId);
        MarksAndStudentDto marksAndStudentDto = new MarksAndStudentDto();

            Integer highMarkTamil = 0;
            Integer highMarkEnglish = 0;
            Integer highMarkMaths = 0;
            Integer highMarkScience = 0;
            Integer highMarkSocialScience = 0;
            for (int i = 0; i < marks.size(); i++) {
                Mark mark = marks.get(i);
                Integer tamil = mark.getTamilMark();
                Long studentId = mark.getStudentId();
                if (tamil > highMarkTamil) {
                    highMarkTamil = tamil;
                    Map<String,String> tamilMap = new HashMap<>();
                    String tamilMark = String.valueOf(tamil);
                    tamilMap.put("tamilMark", tamilMark);
                    String studentStringId = String.valueOf(studentId);
                    tamilMap.put("studentId", studentStringId);

                    Integer studentIntegerId = Integer.parseInt(studentStringId);

                    //Integer sId = studentId.intValue();
                    Student student = studentRepository.getStudent(studentIntegerId);
                    String name = student.getStudentName();

                    tamilMap.put("studentName", name);
                    marksAndStudentDto.setTamil(tamilMap);
                }

                Integer english = mark.getEnglishMark();
                if (english > highMarkEnglish) {
                    highMarkEnglish = english;
                    Map<String,String> englishMap = new HashMap<>();
                    String englishMark = String.valueOf(english);
                    englishMap.put("englishMark", englishMark);
                    String studentStringId = String.valueOf(studentId);
                    englishMap.put("studentId", studentStringId);

                    Integer studentIntegerId = Integer.parseInt(studentStringId);

                    Student student = studentRepository.getStudent(studentIntegerId);
                    String name = student.getStudentName();

                    englishMap.put("studentName", name);
                    marksAndStudentDto.setEnglish(englishMap);
                }
                Integer maths = mark.getMathsMark();
                if(maths > highMarkMaths){
                    highMarkMaths = maths;
                    Map<String,String> mathsMap = new HashMap<>();
                    String mathsMark = String.valueOf(maths);
                    mathsMap.put("mathsMark",mathsMark);
                    String studentStringId = String.valueOf(studentId);
                    mathsMap.put("studentId",studentStringId);

                    Integer studentIntegerId = Integer.parseInt(studentStringId);

                    Student student = studentRepository.getStudent(studentIntegerId);
                    String name = student.getStudentName();
                    mathsMap.put("studentName",name);
                    marksAndStudentDto.setMaths(mathsMap);
                }
                Integer science = mark.getScienceMark();
                if(science > highMarkScience){
                    highMarkScience = science;
                    Map<String,String> scienceMap = new HashMap<>();
                    String scienceMark = String.valueOf(science);
                    scienceMap.put("scienceMark",scienceMark);
                    String studentStringId = String.valueOf(studentId);
                    scienceMap.put("studentId",studentStringId);

                    Integer studentIntegerId = Integer.parseInt(studentStringId);

                    Student student = studentRepository.getStudent(studentIntegerId);
                    String name = student.getStudentName();
                    scienceMap.put("studentName",name);
                    marksAndStudentDto.setScience(scienceMap);
                }
                Integer socialScience = mark.getSocialScienceMark();
                if(socialScience > highMarkSocialScience) {
                    highMarkSocialScience = socialScience;
                    Map<String, String> socialScienceMap = new HashMap<>();
                    String socialScienceMark = String.valueOf(socialScience);
                    socialScienceMap.put("socialScienceMark", socialScienceMark);
                    String studentStringId = String.valueOf(studentId);
                    socialScienceMap.put("studentId", studentStringId);

                    Integer studentIntegerId = Integer.parseInt(studentStringId);

                    Student student = studentRepository.getStudent(studentIntegerId);
                    String name = student.getStudentName();
                    socialScienceMap.put("studentName", name);
                    marksAndStudentDto.setSocialScience(socialScienceMap);
                }

            }


        return marksAndStudentDto;
    }

    public StudentReportDto getStudentDetailsWithPercentage(Long examTypeId){
        List<Mark> marks = markRepository.getMarksByExamTypeId(examTypeId);

        StudentReportDto studentReportDto = new StudentReportDto();
        for (int i=0;i<marks.size();i++){
            Mark mark = marks.get(i);
            Integer tamil = mark.getTamilMark();
            Integer english = mark.getEnglishMark();
            Integer maths = mark.getMathsMark();
            Integer science = mark.getScienceMark();
            Integer socialScience = mark.getSocialScienceMark();

            Integer total = tamil+english+maths+science+socialScience;

            float b = total.floatValue();
            Float percentage = (b/500)*100;

            Long studentId = mark.getStudentId();
            Integer studentIntegerId = studentId.intValue();

            Student student = studentRepository.getStudent(studentIntegerId);
            String name = student.getStudentName();

            ExamType examType = examTypeRepository.getExamType(examTypeId);
            Integer passMark = examType.getPassMark();

            studentReportDto.setPercentage(percentage);
            studentReportDto.setStudentId(studentIntegerId);
            studentReportDto.setStudentName(name);
            studentReportDto.setTotal(total);

        }
        return studentReportDto;
    }
}
