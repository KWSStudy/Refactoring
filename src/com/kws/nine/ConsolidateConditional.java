package com.kws.nine;

/**
 * Created by jihoon on 2016. 6. 6..
 * 중복조건식 통합
 */
public class ConsolidateConditional {


    public static final double IS_PART_TIME = 0;
    public static final double MONTHS_DISABLED = 0;
    public static final double SENIORITY = 0;

    public double disabilityAmount(){
        double returnValue = 0;
        if (SENIORITY < 2) return returnValue;
        if (MONTHS_DISABLED < 2) return returnValue;
        if (IS_PART_TIME < 2) return returnValue;
        return returnValue;
    }


    public double afterDisabilityAmount(){
        double returnValue = 0 ;
        if(SENIORITY < 2 || MONTHS_DISABLED < 2 || IS_PART_TIME < 2){
            return returnValue;
        }
        return returnValue;
    }

    public double ExtractMethodDisabilityAmount(){
        double returnValue = 0 ;
        if(isNotEligibleForDisability()){
            return returnValue;
        }
        return returnValue;
    }

    private boolean isNotEligibleForDisability() {
        return SENIORITY < 2 || MONTHS_DISABLED < 2 || IS_PART_TIME < 2;
    }




}
