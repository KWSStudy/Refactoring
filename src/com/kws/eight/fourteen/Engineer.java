package com.kws.eight.fourteen;

public class Engineer extends Employee{

    public Engineer(int arg) {
        super(arg);
    }

    public int getType(){
        return Employee.ENGINEER;
    }
}
