package com.kws.eight.eights;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private static Set orders = new HashSet();
	
	void addOrder(Order arg){
		arg.setCustomer(this);
	}
	
	Set friendOrders(){
		return orders;
	}

	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	double getPriceFor(Order order){
		return order.getDiscountedPrice(this);
	}

	public static Set getInstance() {
		// TODO Auto-generated method stub
		return orders;
	}

	public boolean containsOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}
}
