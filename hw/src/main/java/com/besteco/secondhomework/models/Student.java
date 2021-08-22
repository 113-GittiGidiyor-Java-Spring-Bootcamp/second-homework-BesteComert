package com.besteco.secondhomework.models;


import com.besteco.secondhomework.models.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private String studentId;

    private String studentName;
    private LocalDate studentDateOfBirth;
    private String studentAddress;
    private Gender studentGender;

    @ManyToMany
    @JoinTable(name = "students-courses", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name ="course_id"))
    private Set<Course> courseList = new HashSet<>();

    public Student() {
    }

    public Student(String name, LocalDate dateOfBirth, String address, Gender gender) {
        this.studentName = name;
        this.studentDateOfBirth = dateOfBirth;
        this.studentAddress = address;
        this.studentGender = gender;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public LocalDate getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(LocalDate studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Gender getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Gender studentGender) {
        this.studentGender = studentGender;
    }

    public Set<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(Set<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentDateOfBirth=" + studentDateOfBirth +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentGender=" + studentGender +
                ", courseList=" + courseList +
                '}';
    }
}