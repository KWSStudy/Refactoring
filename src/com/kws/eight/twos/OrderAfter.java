package com.kws.eight.twos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kws.eight.Log;

public class OrderAfter {
	
	private static Customer _customer;
	
	@SuppressWarnings("static-access")
	public OrderAfter() {
		this._customer = new Customer("customer");
	}
	
	public String getCustomers(){
		return _customer.getCustomers();
	}
	
	public void setCustomer(String customer){
		_customer = new Customer(customer);
	}
	
	private static int numberOrderFor(List<OrderAfter> orders, String customer){
		
		int result = 0;
		
		@SuppressWarnings("rawtypes")
		Iterator iter = orders.iterator();

		while(iter.hasNext()){
			OrderAfter each = (OrderAfter) iter.next();
			if(each.getCustomers().equals(customer)){
				Log.systemLog("getCustomer :" , each.getCustomers());
				result++;
			}
		}
		
		return result;
	}
	
	@SuppressWarnings({ "static-access"})
	public static void main(String[] args) {
		
		int result = 0;
		
		OrderAfter orderCollection = new OrderAfter();
		List<OrderAfter> orders = new ArrayList<OrderAfter>();
		
		orderCollection.setCustomer("");
		orders.add(orderCollection);
		
		result += orderCollection.numberOrderFor(orders, "customer");
		
		Log.systemLog("Count : ", result);
		
	}
}
