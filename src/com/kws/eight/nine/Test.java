package com.kws.eight.nine;

public class Test {
	
	
	double potentiaEnergy(double mass, double height){
		return mass * 981 * height;
	}
	
	static final double GRAVITATION_CONSTANT = 9.81;
	
	double potentiaEnergys(double mass, double height){
		return mass * GRAVITATION_CONSTANT * height;
	}
}
