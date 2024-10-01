package com.hibernate_jpa_crud.cruddemo.dao;

import com.hibernate_jpa_crud.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao     {


    // define field for entitiy manager
    private EntityManager entityManager;

    // injecting entitymanager using constructor injection
    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by firstname desc", Student.class);

        // return query results
        return theQuery.getResultList();

    }

    @Override
    public List<Student> findByLastName(String theLastName) {

        // create query, JPQL Named Parameters
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastname=:theData", Student.class);
        // set query parameters
        theQuery.setParameter("theData", theLastName);
        // return query result
        return theQuery.getResultList();

    }
}
