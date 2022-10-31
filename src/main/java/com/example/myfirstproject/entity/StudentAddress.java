package com.example.myfirstproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "StudentAddress")
public class StudentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_address_id")
    private Integer studentAddressId;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "address_id")
    private Integer addressId;

    public Integer getStudentAddressId(){
        return studentAddressId;
    }

    public void setStudentAddressId(Integer studentAddressId){
        this.studentAddressId = studentAddressId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
