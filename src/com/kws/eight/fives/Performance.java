package com.kws.eight.fives;

public class Performance {
	
	private String name;
	private String wings;

	public String getName() {
		return name;
	}

	public void setName(String arg) {
		this.name = arg;
	}
	
	public int getWins(){
		return Integer.parseInt(wings);
	}
	
	public void setWins(String arg){
		this.wings = arg;
	}
}
