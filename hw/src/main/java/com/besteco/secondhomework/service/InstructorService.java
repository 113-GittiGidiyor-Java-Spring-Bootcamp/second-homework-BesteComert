package com.besteco.secondhomework.service;

import com.besteco.secondhomework.dao.InstructorDAOJPAImpl;
import com.besteco.secondhomework.models.Instructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor>{

    private final InstructorDAOJPAImpl instructorDAOJPA;


    public InstructorService(InstructorDAOJPAImpl instructorDAOJPA) {
        this.instructorDAOJPA = instructorDAOJPA;
    }

    @Override
    public List<Instructor> findAll() {
        return instructorDAOJPA.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return instructorDAOJPA.findById(id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return instructorDAOJPA.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        instructorDAOJPA.deleteById(id);
    }
}
