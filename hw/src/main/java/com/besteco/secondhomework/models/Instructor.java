package com.besteco.secondhomework.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "instructors")
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String instructorId;

    private String instructorName;
    private String instructorPhoneNumber;
    private String instructorEmail;

    @OneToMany(mappedBy = "instructor")
    private Set<Course> courseList = new HashSet<>();

    public Instructor() {
    }

    public Instructor(String name, String phoneNumber, String email) {
        this.instructorName = name;
        this.instructorPhoneNumber = phoneNumber;
        this.instructorEmail = email;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorPhoneNumber() {
        return instructorPhoneNumber;
    }

    public void setInstructorPhoneNumber(String instructorPhoneNumber) {
        this.instructorPhoneNumber = instructorPhoneNumber;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
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
        Instructor that = (Instructor) o;
        return Objects.equals(instructorId, that.instructorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructorId);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId='" + instructorId + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", instructorPhoneNumber='" + instructorPhoneNumber + '\'' +
                ", instructorEmail='" + instructorEmail + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
