package com.learnweb.learnweb.ServiceImple;

import java.util.ArrayList;
import java.util.List;

import com.learnweb.learnweb.Entity.Courses;
import com.learnweb.learnweb.Services.CourseService;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    List<Courses>Allcourses;

    CourseServiceImpl(){
        Allcourses = new ArrayList<>();
        Allcourses.add(new Courses(12,"java","Lubna","Master Of java"));
        Allcourses.add(new Courses(15,"Python","Rimi","This is snake"));
        Allcourses.add(new Courses(18,"Bangla","Nabila","literature"));
    }

    @Override
    public List<Courses> GetAllCourses() {
       
        
        return Allcourses;
    }

    @Override
    public Courses SingleCourse(int id) {
        for(Courses course : Allcourses){
            if(course.getId() == id) return course;
        }
        return null;
    }

    @Override
    public void AddCourse(Courses course) {
        // TODO Auto-generated method stub
        Allcourses.add(course);
        
    }

   
    
}
