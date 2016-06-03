package com.kws.eight.eights;

import java.util.Iterator;

public class Order {
	private Customer customers;

//	public Customer getCustomer() {
//		return customers;
//	}

	public void setCustomer(Customer arg) {
		// this.customer = customer;
		if (customers != null)
			customers.friendOrders().remove(this);
		customers = arg;
		if (customers != null)
			customers.friendOrders().add(this);
	}

	double getDiscountedPrice(Customer customer) {
		return getGrossPrice() * (1 - customer.getDiscount());
	}

	private int getGrossPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("rawtypes")
	Customer getCustomer() {
		Iterator iter = Customer.getInstance().iterator();
		while (iter.hasNext()) {
			Customer each = (Customer) iter.next();
			if (each.containsOrder(this))
				return each;
		}
		return null;
	}

}
