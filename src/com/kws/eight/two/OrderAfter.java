package com.kws.eight.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kws.eight.Log;

public class OrderAfter {
	
	private static Customer _customer;
	
	@SuppressWarnings("static-access")
	public OrderAfter() {
		this._customer = new Customer("customer", 1, "shinrim");
	}
	
	public Customer getCustomers(){
		return _customer.getCustomers();
	}
	
	public void setCustomer(String customer, int phone, String address){
		_customer = new Customer(customer, phone, address);
	}
	
	private static int numberOrderFor(List<Customer> orders, String customer){
		
		int result = 0;
		
		@SuppressWarnings("rawtypes")
		Iterator iter = orders.iterator();

		while(iter.hasNext()){
			Customer each = (Customer) iter.next();
			if(each.getCustomer().equals(customer)){
				Log.systemLog("getCustomer :" , each.getCustomer());
				result++;
			}
			
			if(each.getAddress().equals(customer)){
				Log.systemLog("getAddress :" , each.getAddress());
				result++;
			}
			
		}
		
		return result;
	}
	
	@SuppressWarnings({ "static-access"})
	public static void main(String[] args) {
		
		int result = 0;
		
		OrderAfter orderCollection = new OrderAfter();
		List<Customer> orders = new ArrayList<Customer>();
		
		Customer cu = new Customer("customer", 1, "shinrim");

		orderCollection.setCustomer("customer", 1, "shinrim");
//		orders.add(cu);
		orders.add(orderCollection.getCustomers());
		
		result += orderCollection.numberOrderFor(orders, "customer");
		result += orderCollection.numberOrderFor(orders, "shinrim");
		
		Log.systemLog("Count : ", result);
		
	}
}
