package com.kws.nine;

/**
 * Created by jihoon on 2016. 6. 6..
 */
public class ConsolidateDuplicate {

    public static void main(String[] args) {
        int total = 0;
        int price = 0;

        if(isSpecialDeal()){
            total = price * 9;
            send();
        }else {
            total = price * 9;
            send();
        }

    }

    public static boolean isSpecialDeal(){
        return false;
    }

    public static int send(){
        return 5;
    }

}



class afterConsolidateDuplicate{

    public static void main(String[] args) {


        int total = 0;
        int price = 0;

        if(isSpecialDeal()){
            total = price * 9;
        }else {
            total = price * 9;
        }
        send();
    }
    public static boolean isSpecialDeal(){
        return false;
    }

    public static int send(){
        return 3;
    };
}
