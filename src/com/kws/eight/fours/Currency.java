package com.kws.eight.fours;

public class Currency {
	private String code;

	public String getCode() {
		return code;
	}

	private Currency(String code){
		this.code = code;
	}
	
//	public boolean equals(Object arg){
//		if(!(arg instanceof Currency)) return false;
//		Currency other = (Currency)arg;
//		return (this.getCode().equals(other.getCode()));
//	}

	public int hashCode(){
		return this.code.hashCode();
	}
	
	public static void main(String[] args) {
		System.out.println(new Currency("USD").equals(new Currency("USD"))); // false;
//		System.out.println(new Currency("USD").getCode().equals(new Currency("USD").getCode())); // true;
		
	}
}
