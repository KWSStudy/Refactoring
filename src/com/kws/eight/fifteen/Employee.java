package com.kws.eight.fifteen;

public class Employee {
    private EmployeeType type;

//    static final int ENGINEER = 0;
//    static final int SALESMAN = 1;
//    static final int MANAGER = 2;
    
    private int monthlySalary = 100;
    private int commission = 10;
    private int bonus = 30;

    public Employee(EmployeeType arg) {
        this.type = arg;
    }
    
    int getType(){
    	return type.getTypeCode();
    }

    public void setType(int arg) {
    	type = EmployeeType.newType(arg);
    }
    
    int payAmount(int arg) {
        switch (arg) {
        case EmployeeType.ENGINEER:
            return monthlySalary;
        case EmployeeType.SALESMAN:
        	return  monthlySalary + commission;
        case EmployeeType.MANAGER:
        	return  monthlySalary + bonus;
        default:
            throw new IllegalArgumentException("Incorrect");
        }
    }

}
