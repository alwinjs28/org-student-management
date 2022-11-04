package com.example.myfirstproject.dto;

import java.io.Serializable;

public class ResultDto implements Serializable {
    private Integer studentPassed;
    private Integer studentFailed;

    public Integer getStudentPassed() {
        return studentPassed;
    }

    public void setStudentPassed(Integer studentPassed) {
        this.studentPassed = studentPassed;
    }

    public Integer getStudentFailed() {
        return studentFailed;
    }

    public void setStudentFailed(Integer studentFailed) {
        this.studentFailed = studentFailed;
    }
}
