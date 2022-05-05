package com.learnweb.learnweb.Entity;

public class Courses {
    private int id;
    private String course_name;
    private String course_details;
    private String course_author_name;

    Courses(){

    }

    public Courses(int id, String cname, String cdetails, String course_author_name){
        this.id= id;
        this.course_name=cname;
        this.course_author_name=course_author_name;
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

    public void setAuthor(String cname){
        this.course_author_name=cname;
    }

    public String getAuthor(){
        return this.course_author_name;
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
