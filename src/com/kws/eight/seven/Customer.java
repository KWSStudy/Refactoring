package com.kws.eight.seven;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	@SuppressWarnings("rawtypes")
	private Set orders = new HashSet();
	
	@SuppressWarnings("rawtypes")
	Set friendOrders(){
		/*연결을 변경할 때 Order에 의해서만 사용되어야 함.*/
		return orders;
	}
	
	void addOrder(Order arg){
		arg.addCustomer(this);
	}
	
	void removeOrder(Order arg){
		arg.removeCustomer(this);
	}

}
