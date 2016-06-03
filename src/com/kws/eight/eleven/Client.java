package com.kws.eight.eleven;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;


public class Client {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        Person kent = new Person();

        Set s = new HashSet();

//      before
//      s.add(new Course("스몰토크 프로그래밍", false));
//      s.add(new Course("싱글몰드 위스키 음미하기", true));

//      after
        kent.addCourse(new Course("스몰토크 프로그래밍", false));
        kent.addCourse(new Course("싱글몰드 위스키 음미하기", true));

//      kent.setCourse(s);
        kent.initalizeCourse(s);

//      Assert.assertEquals(2, kent.getCourse().size());
        System.out.println("---------------------------------");
        Course refact = new Course("리팩토링", true);

        kent.getCourse().add(refact);

//      before
//      kent.getCourse().add(new Course("지독한 빈정거림", false));
//      after
        kent.addCourse(new Course("지독한 빈정거림", false));

//      Assert.assertEquals(4, kent.getCourse().size());

        kent.getCourse().remove(refact);

//      Assert.assertEquals(3, kent.getCourse().size());

//      System.out.println(kent.getCourse().size());
        
        //고급과정
        Iterator iter = kent.getCourse().iterator();

        int count = 0;

        while(iter.hasNext()){
            Course each = (Course) iter.next();
            if(each.isAdvanced()){
                count++;
            }
        }

        System.out.println(count);
    }

}
