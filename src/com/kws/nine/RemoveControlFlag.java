package com.kws.nine;

/**
 * Created by jihoon on 2016. 6. 6..
 * 제어 플래그 제거
 */
public class RemoveControlFlag {

    // 1. 간단한 제어플래그를 break문으로 교체
    //여러 사람중에 하드코딩한 용의자 don과 john이있는지 검사
    public void checkSecurityBefore(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (!found) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = true;//이부분이 제어플래그
                }
                if (people[i].equals("John")) {
                    sendAlert();
                    found = true;//이부분이 제어플래그
                }
            }
        }
    }

    //위에서 제어플래그 위치를 찾고
    //제어플래그를 break로 바꾸고
    //이전에 제어플래그로 참조하던곳을 전부 삭제
    public void checkSecurityAfter(String[] people) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                break;//이부분이 제어플래그
            }
            if (people[i].equals("John")) {
                sendAlert();
                break;//이부분이 제어플래그
            }
        }
    }

/*

    public void checkSecurityBefore2(String people) {
        String found = "";
        for (int i = 0; i < people.length(); i++) {
            if (found.equals("")) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = "Don";
                }
                if (people[i].equals("John")) {
                    sendAlert();
                    found = "John";
                }
            }
        }
        someLaterCode(found);
    }

*/


    // 2. 제어 플래그를 return 문으로 교체
    // 여기서 found 변수는 두가지 역할을 한다
    // 1. 결과를 나타내고 제어플래그 역할을 한다
    // 2. 이럴때는 found변수를 알아내는 코드를 메서드로 빼내자
    public void checkSecurityBefore2(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                //found = "Don"; 제어플래그를 return문으로 교체
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                //found = "John";
                return "John";
            }
        }
        return "";
    }


    public void sendAlert() {

    }

    public void someLaterCode(String found) {

    }

}
