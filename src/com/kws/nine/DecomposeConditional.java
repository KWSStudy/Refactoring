package com.kws.nine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jihoon on 2016. 6. 6..
 */
public class DecomposeConditional {
    public static int CHARGE = 0;
    public static final int QUANTITY = 100;
    public static final int WINTER_RATE = 300;
    public static final int SUMMER_RATE = 200;
    public static final int WINTER_SERVICE_CHARGE = 50;

    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        String summerStart = "20160501";
        String summerEnd = "20160930";

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date SUMMER_START = dateFormat.parse(summerStart);  // Date로 변환
        Date SUMMER_END = dateFormat.parse(summerEnd);  // Date로 변환
        System.out.println(SUMMER_START);
        System.out.println(SUMMER_END);


        //겨울인지 여름인지 따라 달라지는 난방비를 계산하는 코드
        //여름 시작일이랑 여름 종료일을 정해주자
        //여름 시작전 이거나 여름이 끝난후 즉 겨울
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            System.out.println("겨울겨울겨울");
            CHARGE = QUANTITY * WINTER_RATE + WINTER_SERVICE_CHARGE;
        }//지금은 여름
        else {
            System.out.println("여름여름여름");
            CHARGE = QUANTITY * SUMMER_RATE;
        }
        System.out.println("CHARGE ==== " + CHARGE);
    }

}



class aftersource{
    public static int CHARGE = 0;
    public static final int QUANTITY = 100;
    public static final int WINTER_RATE = 300;
    public static final int SUMMER_RATE = 200;
    public static final int WINTER_SERVICE_CHARGE = 50;

    public static void main(String[] args) throws ParseException {
        //리팩토링을 해보자~
        Date date = new Date();

        String summerStart = "20160501";
        String summerEnd = "20160930";

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date SUMMER_START = dateFormat.parse(summerStart);  // Date로 변환
        Date SUMMER_END = dateFormat.parse(summerEnd);  // Date로 변환
        System.out.println(SUMMER_START);
        System.out.println(SUMMER_END);

        //1. 조건식 if절 과 각 분기 절을 다음과 같이 각각의 메서드로 빼자
        if (notSummer(date, SUMMER_START, SUMMER_END)) {
            System.out.println("겨울겨울겨울");
            CHARGE = winterCharge();
        }//지금은 여름
        else {
            System.out.println("여름여름여름");
            CHARGE = summerCharge();
        }
        System.out.println("CHARGE ==== " + CHARGE);
    }

    private static int summerCharge() {
        return QUANTITY * SUMMER_RATE;
    }

    private static int winterCharge() {
        return QUANTITY * WINTER_RATE + WINTER_SERVICE_CHARGE;
    }

    private static boolean notSummer(Date date, Date SUMMER_START, Date SUMMER_END) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}


