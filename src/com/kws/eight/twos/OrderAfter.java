package com.kws.eight.twos;

import java.util.Collection;
import java.util.Iterator;


public class OrderAfter {
	
	private Customer _customer;
	
	public OrderAfter(String arg) {
		this._customer = new Customer(arg);
	}
	
	public String getCustomers(){
		return _customer.getCustomers();
	}
	
	public void setCustomer(String customer){
		_customer = new Customer(customer);
	}
	
	@SuppressWarnings("rawtypes")
	private static int numberOrderFor(Collection orders, String customer){
		
		int result = 0;
		
		Iterator iter = orders.iterator();

		while(iter.hasNext()){
			OrderAfter each = (OrderAfter) iter.next();
			if(each.getCustomers().equals(customer)){
				result++;
			}
		}
		
		return result;
	}
	
}
