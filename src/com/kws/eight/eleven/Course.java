package com.kws.eight.eleven;

public class Course {

    private String name;
    private boolean isA;

    public Course(String name, boolean isAdvanced){
        this.name = name;
        this.isA = isAdvanced;
    }

    public boolean isAdvanced(){
        return true;
    }
}
