package com.example.myfirstproject.dto;

import java.util.HashMap;
import java.util.Map;

public class MarksAndStudentDto {
    private Map<String,String> tamil;
    private Map<String,String> english;
    private Map<String,String> maths;
    private Map<String,String> science;
    private Map<String,String> socialScience;

    public MarksAndStudentDto(){
        System.out.println("Default constructor called");
    }

    public Map<String, String> getTamil() {
        return tamil;
    }

    public void setTamil(Map<String, String> tamil) {
        this.tamil = tamil;
    }

    public Map<String, String> getEnglish() {
        return english;
    }

    public void setEnglish(Map<String, String> english) {
        this.english = english;
    }

    public Map<String, String> getMaths() {
        return maths;
    }

    public void setMaths(Map<String, String> maths) {
        this.maths = maths;
    }

    public Map<String, String> getScience() {
        return science;
    }

    public void setScience(Map<String, String> science) {
        this.science = science;
    }

    public Map<String, String> getSocialScience() {
        return socialScience;
    }

    public void setSocialScience(Map<String, String> socialScience) {
        this.socialScience = socialScience;
    }
}
