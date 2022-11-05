package com.example.myfirstproject.dto;

import java.io.Serializable;

public class HighestMarkDto implements Serializable {
    private Integer tamil;
    private Integer english;
    private Integer maths;
    private Integer science;
    private Integer socialScience;

    public Integer getTamil() {
        return tamil;
    }

    public void setTamil(Integer tamil) {
        this.tamil = tamil;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    public Integer getSocialScience() {
        return socialScience;
    }

    public void setSocialScience(Integer socialScience) {
        this.socialScience = socialScience;
    }
}
