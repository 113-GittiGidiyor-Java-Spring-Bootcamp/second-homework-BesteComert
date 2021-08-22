package com.besteco.secondhomework.dao;

import com.besteco.secondhomework.models.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDAOJPAImpl implements CourseDAO<Course>{

    private final EntityManager entityManager;

    public CourseDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("Select c FROM Course c", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return entityManager.find(Course.class,id);
    }

    @Override
    public Course save(Course course) {
        return entityManager.merge(course);
    }

    @Override
    public void deleteById(int id) {
        Course course = findById(id);
        entityManager.remove(course);
    }
}
