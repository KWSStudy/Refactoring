package com.kws.one.after;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	
	public Customer(String name) {
		_name = name;
	}
	
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	//리팩토링이 필요한 핵심 메서드
	//너무 많은 기능을 가지고 있다
	public String statement() {
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		String result = getName() + " 고객님의 대여 기록 \n";
		
		while(rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			
			//대여하는 비디오 정보와 대여로를 출
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		
		//footer
		result += "누적 대여료 : " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints());
		return result;
	}
	
	public String htmlStatement() {
		Iterator<Rental> rentals = _rentals.iterator();
		String result = "<H1><EM>" + getName() + "고객님의 대여 기록 </EM></H1><P>\n";
		while(rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			
			//모든 대여 비디오 정보와 대여로를 출
			result += each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		//footer
		result += "<P>누적 대여료 : <EM>" + String.valueOf(getTotalCharge()) + "</EM></P>\n";
		result += "<P>적립 포인트 : <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM></P";
		return result;
	}
	
	
	private double getTotalCharge() {
		double result = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		
		Iterator<Rental> rentals = _rentals.iterator();
		
		while (rentals.hasNext()) {
			Rental each = (Rental) rentals.next();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
}
