package com.besteco.secondhomework.dao;

import com.besteco.secondhomework.models.Instructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class InstructorDAOJPAImpl implements InstructorDAO<Instructor>{

    private final EntityManager entityManager;

    public InstructorDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Instructor> findAll() {
        return entityManager.createQuery("Select i From Instructor i", Instructor.class).getResultList();
    }

    @Override
    public Instructor findById(int id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        return entityManager.merge(instructor);
    }

    @Override
    public void deleteById(int id) {
        Instructor instructor= findById(id);
        entityManager.remove(instructor);
    }
}
