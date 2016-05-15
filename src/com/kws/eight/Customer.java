package com.kws.eight;

public class Customer {
	private final String _customer;
	private final int _phone;
	private final String _address;

	public Customer(String customer, int phone, String address) {
		this._customer = customer;
		this._phone = phone;
		this._address = address;
	}

	public Customer getCustomers() {
		return this;
	}
	
	public String getCustomer(){
		return this._customer;
	}
	
	public int getPhone(){
		return this._phone;
	}
	
	public String getAddress(){
		return this._address;
	}

}
