package com.learnweb.learnweb.Controller;

import java.util.List;

import com.learnweb.learnweb.Entity.Courses;
import com.learnweb.learnweb.Services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String Home(){
        return "i love you";
    }

    @GetMapping("/courses")
    public List<Courses> GetAllCourses() {
        return this.courseService.GetAllCourses();
        
    }

    @GetMapping("/courses/{courseId}")
    public Courses GetCourse(@PathVariable String courseId) {

       return this.courseService.SingleCourse(Integer.parseInt(courseId));
            
    }

    @PutMapping("/courses")
    public String AddCourse(@RequestBody Courses course){

        this.courseService.AddCourse(course);


        return "successfuly added ";
    }




    
}
