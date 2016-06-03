package com.kws.eight.eleven;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

public class Person {

//  private Set course;
    @SuppressWarnings("rawtypes")
    private Set course = new HashSet();

    
//  @SuppressWarnings("unchecked")
//  public Set getCourse() {
//      return Collections.unmodifiableSet(course);
//      unmodifiableSet 메소드는 지정된 세트의 변경 불가능한 뷰를 돌려줍니다.
//  }

//  public void setCourse(Set course) {
//      this.course = course;
//  }
    
    public Set getCourse() {
        return course;
    }

//  setCourses
    @SuppressWarnings("rawtypes")
    public void initalizeCourse(Set arg) {
//      Assert.isTrue(course.isEmpty());
        Iterator iter = arg.iterator();
        while(iter.hasNext()){
            addCourse((Course) iter.next());
        }
    }
    
//  메서드 복사기능
//  초기화하려고 원소를 추가할때 추가 기능이 확실히 필요 없다면 다음과 같이 루프를 삭제하고 addAll메서드를 사용.
//  public void initalizeCourse(Set arg) {
//      Assert.isTrue(course.isEmpty());
//      course.addAll(arg);
//  }

    @SuppressWarnings("unchecked")
    public void addCourse(Course arg){
        course.add(arg);
    }

    public void removeCourse(Course arg){
        course.remove(arg);
    }


    @SuppressWarnings("rawtypes")
    int numberOfAdvancedCourse(Person person){
        Iterator iter = person.getCourse().iterator();

        int count = 0;

        while(iter.hasNext()){
            Course each = (Course) iter.next();
            if(each.isAdvanced()){
                count++;
            }
        }

        return count;
    }

    int numberOfCourse(){
        return course.size();
    }

}