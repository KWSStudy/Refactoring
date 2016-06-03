package com.kws.eight.threes;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
	
	private final String name;
	
	//public -> private 
	private Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@SuppressWarnings("rawtypes")
	private static Dictionary _instances = new Hashtable();
	// add change
	public static Customer create(String name){
//		return new Customer(name);
//		미리 load된 객체반환
		return ((Customer) _instances.get(name));
	}
	
	static void loadCustomers(){
		new Customer("우리 렌터카").store();
		new Customer("커피 자판기").store();
		new Customer("삼천리 가스").store();
	}
	
	@SuppressWarnings("unchecked")
	private void store(){
		_instances.put(this.getName(), this);
	}
	
	public static Customer getNamed(String name){
		return (Customer) _instances.get(name);
	}
	
}
