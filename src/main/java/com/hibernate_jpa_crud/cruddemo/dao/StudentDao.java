package com.hibernate_jpa_crud.cruddemo.dao;

import com.hibernate_jpa_crud.cruddemo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {


    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);

}
