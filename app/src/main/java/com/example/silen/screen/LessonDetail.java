package com.example.silen.screen;

public class LessonDetail {
    String name;
    String detail;
    public LessonDetail(String name, String detail){
        this.name = name;
        this.detail = detail;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }
    public String getName(){
        return name;
    }
    public String getDetail(){
        return  detail;
    }
}
