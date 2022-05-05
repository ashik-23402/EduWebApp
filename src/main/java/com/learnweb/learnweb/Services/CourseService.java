package com.learnweb.learnweb.Services;

import java.util.List;

import com.learnweb.learnweb.Entity.Courses;

public interface CourseService  {

    public List<Courses>GetAllCourses();
    public Courses SingleCourse(int id);
    public boolean AddCourse(Courses course);
    
    
   
    
}
