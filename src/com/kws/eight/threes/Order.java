package com.kws.eight.threes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.kws.eight.Log;

public class Order {
	
	private Customer customer;
	
	public Order(String customerName){
		this.customer = Customer.create(customerName);
	}

	public String getCustomer() {
		return customer.getName();
	}
	
//	public void setCustomer(String customerName) {
//		this.customer = new Customer(customerName);
//	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	private static int numberOrderFor(Collection orders, String customer){
		
		int result = 0;
		
		Iterator iter = orders.iterator();

		while(iter.hasNext()){
			Order each = (Order) iter.next();
			if(each.getCustomer().equals(customer)){
				result++;
			}
		}
		
		return result;
	}
	
}
