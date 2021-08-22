package com.besteco.secondhomework.dao;

import com.besteco.secondhomework.models.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOJPAImpl implements StudentDAO<Student>{

    private final EntityManager entityManager;

    public StudentDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("Select s From Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public void deleteById(int id) {
        Student student = findById(id);
        entityManager.remove(student);
    }
}
