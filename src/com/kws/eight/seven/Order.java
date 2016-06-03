package com.kws.eight.seven;

import java.util.Set;

public class Order {
	Customer customers;

	public Customer getCustomer() {
		return customers;
	}

	@SuppressWarnings("unchecked")
	public void setCustomer(Customer arg) {
		//this.customer = customer;
		if(customers != null) customers.friendOrders().remove(this);
		customers = arg;
		if(customers != null) customers.friendOrders().add(this);
	}
	
	//연결제어 메서드
	@SuppressWarnings({ "unchecked", "rawtypes" })
	void addCustomer(Customer arg){
		arg.friendOrders().add(this);
		((Set) customers).add(arg);
//		customers.friendOrders().add(arg);
	}
	
	@SuppressWarnings("rawtypes")
	void removeCustomer(Customer arg){
		arg.friendOrders().remove(this);
		((Set) customers).remove(arg);
//		customers.friendOrders().remove(arg);
	}
	

}
