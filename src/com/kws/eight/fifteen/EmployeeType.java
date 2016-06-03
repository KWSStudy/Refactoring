package com.kws.eight.fifteen;

abstract class EmployeeType {
	
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
	
	abstract int getTypeCode();
	
	static EmployeeType newType(int code){
    	switch (code) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return  new Manager();
		default:
			throw new IllegalArgumentException("사원 부호가 잘못됨.");
		}
	}
}
