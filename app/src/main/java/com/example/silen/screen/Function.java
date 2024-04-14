package com.example.silen.screen;

public class Function {
    private String title;
    private int icon;
    public Function(String title, int icon){
        this.title = title;
        this.icon = icon;
    }
    public String getTitle(){
        return title;
    }
    public int getIcon(){
        return  icon;
    }
    public void setIcon(int icon){
        this.icon = icon;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
