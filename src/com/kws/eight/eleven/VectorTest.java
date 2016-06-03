package com.kws.eight.eleven;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

    private Vector course;

    public Vector getCourse() {
        return course;
    }

    public void setCourse(Vector course) {
        this.course = course;
    }

    @SuppressWarnings("unchecked")
    public void addCourse(Course arg){
        course.addElement(arg);
    }

    public void removeCourse(Course arg){
        course.removeElement(arg);
    }

    @SuppressWarnings("rawtypes")
    public void initalizeCourse(Vector arg) {
//      Assert.isTrue(course.isEmpty());
        Enumeration iter = arg.elements();
        while(iter.hasMoreElements()){
            addCourse((Course) iter.nextElement());
        }
    }

}