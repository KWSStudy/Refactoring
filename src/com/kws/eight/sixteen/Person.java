package com.kws.eight.sixteen;

class Person {
	private final boolean _isMale;
	private final char _code;
	
	static Person createMale(){
		return new Person(true,'M');
	}
	
	static Person createFemale(){
		return new Person(false,'F');
	}
	
	protected Person (boolean isMale,char code) {
		this._isMale = isMale;
		this._code = code;
	}
	
	public static void main(String[] args) {
		Person kent = Person.createMale();
	}
	
	boolean isMale(){
		return _isMale;
	}
}
