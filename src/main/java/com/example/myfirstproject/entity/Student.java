package com.example.myfirstproject.entity;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name="student_id")
   private Integer studentId;

   @Column(name="student_name")
   private String studentName;

   @Column(name = "student_age")
   private Integer studentAge;

   @Column(name = "student_blood_group")
   private String studentBloodGroup;

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

   public Integer getStudentAge() {
      return studentAge;
   }

   public void setStudentAge(Integer studentAge) {
      this.studentAge = studentAge;
   }

   public String getStudentBloodGroup() {
      return studentBloodGroup;
   }

   public void setStudentBloodGroup(String studentBloodGroup) {
      this.studentBloodGroup = studentBloodGroup;
   }
}
