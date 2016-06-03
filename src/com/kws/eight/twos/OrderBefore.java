package com.kws.eight.twos;

import java.util.Collection;
import java.util.Iterator;

public class OrderBefore {
	private String customer;
	
	
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	private static int numberOrderFor(Collection orders, String customer){
		int result = 0;
		Iterator iter = orders.iterator();
		while(iter.hasNext()){
			OrderBefore each = (OrderBefore) iter.next();
			if(each.getCustomer().equals(customer)){
				result++;
			}
		}
		return result;
	}
	
}
