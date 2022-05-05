package com.learnweb.learnweb.Controller;

import java.util.List;
import java.util.Optional;

import com.learnweb.learnweb.Entity.Courses;
import com.learnweb.learnweb.Services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Courses>> GetAllCourses() {
        List<Courses>allcourses =  this.courseService.GetAllCourses();

        if(allcourses.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); 
        }

        return ResponseEntity.of(Optional.of(allcourses));
        
    }

    @GetMapping("/courses/{courseId}")
    public ResponseEntity<Courses> GetCourse(@PathVariable String courseId) {

       Courses courses =  this.courseService.SingleCourse(Integer.parseInt(courseId));
       if(courses == null){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }

       return ResponseEntity.of(Optional.of(courses));
            
    }

    @PutMapping("/courses")
    public ResponseEntity<Void> AddCourse(@RequestBody Courses course){

        boolean result = this.courseService.AddCourse(course);

        if(result){
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();



    }




    
}
