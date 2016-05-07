package com.kws.one.after;

public class ExamTest {
	public static void main(String [] args) {
		
		Customer customer = new Customer("돈일");
		
		Movie movie1 = new Movie("시빌워", Movie.NEW_RELEASE);
		Movie movie2 = new Movie("탐정 홍길동",Movie.CHILDRENS);
		
		Rental rental = new Rental(movie1, 3);
		Rental rental2 = new Rental(movie2, 4);
		
		customer.addRental(rental);
		customer.addRental(rental2);
				
		System.out.println(customer.statement());
		System.out.println(customer.htmlStatement());
	}
}
