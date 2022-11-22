package com.example.myfirstproject.dto;

import java.io.Serializable;
import java.util.List;

public class StudentReportDto implements Serializable {
    private Integer studentId;
    private String studentName;
    private Integer total;
    private String passAndFail;
    private Float percentage;
    private String address;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getPassAndFail() {
        return passAndFail;
    }

    public void setPassAndFail(String passAndFail) {
        this.passAndFail = passAndFail;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
