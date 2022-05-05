package com.learnweb.learnweb.ServiceImple;


import java.util.List;

import com.learnweb.learnweb.Dao.CourseRepo;
import com.learnweb.learnweb.Entity.Courses;
import com.learnweb.learnweb.Services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    // List<Courses>Allcourses;

    @Autowired
    private CourseRepo courseRepo;

    // CourseServiceImpl(){
    //     // Allcourses = new ArrayList<>();
    //     // Allcourses.add(new Courses(12,"java","Lubna","Master Of java"));
    //     // Allcourses.add(new Courses(15,"Python","Rimi","This is snake"));
    //     // Allcourses.add(new Courses(18,"Bangla","Nabila","literature"));
    // }

    @Override
    public List<Courses> GetAllCourses() {
       
        List<Courses>allcourse = (List<Courses>) this.courseRepo.findAll();

        return allcourse;
    }

    @Override
    public Courses SingleCourse(int id) {
        Courses c = null;
        try{
            c = this.courseRepo.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public boolean AddCourse(Courses course) {
        
        Courses c = this.courseRepo.save(course);

        if(c == null){
            return false;
        }
        return true;
       
        
    }

   
    
}
