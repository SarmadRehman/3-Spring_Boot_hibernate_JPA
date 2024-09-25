package com.hibernate_jpa_crud.cruddemo.dao;

import com.hibernate_jpa_crud.cruddemo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {


    void save(Student theStudent);
}
