package com.besteco.secondhomework.service;

import com.besteco.secondhomework.dao.CourseDAOJPAImpl;
import com.besteco.secondhomework.models.Course;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CourseService implements BaseService<Course> {

    private final CourseDAOJPAImpl courseDAOJPA;

    public CourseService(CourseDAOJPAImpl courseDAOJPA) {
        this.courseDAOJPA = courseDAOJPA;
    }

    @Override
    public List<Course> findAll() {
        return courseDAOJPA.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseDAOJPA.findById(id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return courseDAOJPA.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDAOJPA.deleteById(id);
    }
}
