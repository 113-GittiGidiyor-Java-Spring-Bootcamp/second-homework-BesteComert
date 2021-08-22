package com.besteco.secondhomework.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private String courseId;

    private String courseName;

    private Integer courseCode;

    private Integer courseScore;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    //@ManyToMany(mappedBy = "courseList")
    //private List<Student> studentList;

    public Course() {
    }

    public Course(String courseName, Integer courseCode, Integer courseScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseScore = courseScore;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(Integer courseScore) {
        this.courseScore = courseScore;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    //public List<Student> getStudentList() {
    //    return studentList;
    //}

    //public void setStudentList(List<Student> studentList) {
    //   this.studentList = studentList;
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", courseScore=" + courseScore +
                ", instructor=" + instructor +
                //", studentList=" + studentList +
                '}';
    }
}
