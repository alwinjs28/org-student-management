package com.example.myfirstproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "examType")
public class ExamType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_type_id")
    private Long examTypeId;
    @Column(name = "exam_name")
    private String examName;
    @Column(name = "pass_mark")
    private Integer passMark;

    public Long getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(Long examTypeId) {
        this.examTypeId = examTypeId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Integer getPassMark() {
        return passMark;
    }

    public void setPassMark(Integer passMark) {
        this.passMark = passMark;
    }
}
