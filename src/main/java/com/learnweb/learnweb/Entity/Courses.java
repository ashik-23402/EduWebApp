package com.learnweb.learnweb.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String course_name;
    private String course_details;

    @OneToOne(cascade = CascadeType.ALL)
    private Author course_author;

    Courses(){

    }

    public Courses(int id, String cname, String cdetails, Author course_author){
        this.id= id;
        this.course_name=cname;
        this.course_author=course_author;
        this.course_details=cdetails;

    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }

    public void setCourse(String cname){
        this.course_name=cname;
    }

    public String getCourse(){
        return this.course_name;
    }

    public void setAuthor(Author cname){
        this.course_author=cname;
    }

    public Author getAuthor(){
        return this.course_author;
    }

    public void setDesc(String cname){
        this.course_details=cname;
    }

    public String getDesc(){
        return this.course_details;
    }

    


    //all field setter gatter i will addd;

    public String toString(){
        return "lubna";
    }




}
