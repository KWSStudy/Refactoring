package com.kws.one.before;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

	public double amountFor() {
        double thisAmount = 0;
        switch (getMovie().getPriceCode()) {
        case Movie.REGULAR:
            thisAmount += 2;
            if(getDaysRented() > 2)
                thisAmount += (getDaysRented() - 2) * 1.5;
            break;
        case Movie.NEW_RELEASE:
            thisAmount += getDaysRented() * 3;
            break;
        case Movie.CHILDRENS:
            thisAmount += 1.5;
            if(getDaysRented() > 3)
                thisAmount += (getDaysRented() - 3) * 1.5;
            break;
        }
        return thisAmount;
    }
}
