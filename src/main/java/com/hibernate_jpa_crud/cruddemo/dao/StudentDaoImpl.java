package com.hibernate_jpa_crud.cruddemo.dao;

import com.hibernate_jpa_crud.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
}
