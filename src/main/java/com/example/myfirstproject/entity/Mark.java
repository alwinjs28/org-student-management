package com.example.myfirstproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "mark")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mark_id")
    private Long markId;
    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "tamil_mark")
    private Integer tamilMark;
    @Column(name = "english_mark")
    private Integer englishMark;
    @Column(name = "maths_mark")
    private Integer mathsMark;
    @Column(name = "science_mark")
    private Integer scienceMark;
    @Column(name = "social_science_mark")
    private Integer socialScienceMark;
    @Column(name = "exam_type")
    private Long examType;

    public Long getMarkId() {
        return markId;
    }

    public void setMarkId(Long markId) {
        this.markId = markId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getTamilMark() {
        return tamilMark;
    }

    public void setTamilMark(Integer tamilMark) {
        this.tamilMark = tamilMark;
    }

    public Integer getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(Integer englishMark) {
        this.englishMark = englishMark;
    }

    public Integer getMathsMark() {
        return mathsMark;
    }

    public void setMathsMark(Integer mathsMark) {
        this.mathsMark = mathsMark;
    }

    public Integer getScienceMark() {
        return scienceMark;
    }

    public void setScienceMark(Integer scienceMark) {
        this.scienceMark = scienceMark;
    }

    public Integer getSocialScienceMark() {
        return socialScienceMark;
    }

    public void setSocialScienceMark(Integer socialScienceMark) {
        this.socialScienceMark = socialScienceMark;
    }

    public Long getExamType() {
        return examType;
    }

    public void setExamType(Long examType) {
        this.examType = examType;
    }
}
