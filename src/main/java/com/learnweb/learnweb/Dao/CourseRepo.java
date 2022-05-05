package com.learnweb.learnweb.Dao;

import com.learnweb.learnweb.Entity.Courses;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Courses,Integer> {

    public Courses findById(int id);
    
}
