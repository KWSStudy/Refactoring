package com.kws.one.after;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String _title;
	private Price _price;
	
	public Movie(String title, int priceCode){
		_title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		switch(arg) {
			case REGULAR:
				_price = new RegularPrice();
				break;
			case CHILDRENS:
				_price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
		}
	}
	
	public String getTitle() {
		return _title;
	}
	
	//별도의 메서드로 작성 
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		
		if((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else {
			return 1;
		}
	}
}
