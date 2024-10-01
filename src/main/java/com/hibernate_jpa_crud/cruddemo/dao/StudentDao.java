package com.hibernate_jpa_crud.cruddemo.dao;

import com.hibernate_jpa_crud.cruddemo.entity.Student;


import java.util.List;


public interface StudentDao {


    void save(Student theStudent);

    List<Student> findByLastName(String theLastName);

    List<Student> findAll();

    Student findById(int theId);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
