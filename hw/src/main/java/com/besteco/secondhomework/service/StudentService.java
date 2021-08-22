package com.besteco.secondhomework.service;

import com.besteco.secondhomework.dao.StudentDAOJPAImpl;
import com.besteco.secondhomework.models.Student;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService implements BaseService<Student>{

    private final StudentDAOJPAImpl studentDAOJPA;

    public StudentService(StudentDAOJPAImpl studentDAOJPA) {
        this.studentDAOJPA = studentDAOJPA;
    }

    @Override
    public List<Student> findAll() {
        return studentDAOJPA.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentDAOJPA.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentDAOJPA.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentDAOJPA.deleteById(id);
    }
}
