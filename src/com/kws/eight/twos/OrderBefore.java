package com.kws.eight.twos;

import java.util.List;

import com.kws.eight.Log;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderBefore {
	private String _customer;
	private int _phone;
	private String _address;
	
	public String get_customer() {
		return _customer;
	}
	public void set_customer(String _customer) {
		this._customer = _customer;
	}
	public int get_phone() {
		return _phone;
	}
	public void set_phone(int _phone) {
		this._phone = _phone;
	}
	public String get_address() {
		return _address;
	}
	public void set_address(String _address) {
		this._address = _address;
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
			
			if(each.get_address().equals(customer)){
				Log.systemLog("address :" , each.get_address());
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
		orderCollection.set_address("shinrim");
		
		List<OrderBefore> orders = new ArrayList<OrderBefore>();
		
		orders.add(orderCollection);
		
		result += orderCollection.numberOrderFor(orders, "customer");
		result += orderCollection.numberOrderFor(orders, "shinrim");
		
		Log.systemLog("Count : ", result);
		
	}
	
}
