package com.kws.eight.twos;

import java.util.List;

import com.kws.eight.Log;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderBefore {
	private String _customer;
	
	public String get_customer() {
		return _customer;
	}
	public void set_customer(String _customer) {
		this._customer = _customer;
	}
	
	static int numberOrderFor(List<OrderBefore> orders, String customer){
		
		int result = 0;
		
		@SuppressWarnings("rawtypes")
		Iterator iter = orders.iterator();
		
		while(iter.hasNext()){
			OrderBefore each = (OrderBefore) iter.next();
			if(each.get_customer().equals(customer)){
				Log.systemLog("customer :" , each.get_customer());
				result++;
			}
			
		}
		
		return result;
	}
	
	@SuppressWarnings({ "static-access"})
	public static void main(String[] args) {
		
		int result = 0;
		
		OrderBefore orderCollection = new OrderBefore();
		
		orderCollection.set_customer("customer");
		
		List<OrderBefore> orders = new ArrayList<OrderBefore>();
		
		orders.add(orderCollection);
		
		result += orderCollection.numberOrderFor(orders, "customer");
		
		Log.systemLog("Count : ", result);
		
	}
	
}
