package com.kws.eight.six;

import java.util.Observable;

public class Interval extends Observable{
	private String end = "0";
	private String start = "0";
	private String length = "0";
	
	String getEnd(){
		return end;
	}
	
	void setEnd(String arg){
		this.end = arg;
		setChanged();
		notifyObservers();
	}
	
	String getStart(){
		return start;
	}
	
	void setStart(String arg){
		this.start = arg;
		setChanged();
		notifyObservers();
	}
	
	String getLength(){
		return length;
	}
	
	void setLength(String arg){
		this.length = arg;
		setChanged();
		notifyObservers();
	}
	
	void calculateLength(){
		try{
			int start = Integer.parseInt(getStart());
			int end = Integer.parseInt(getEnd());
			int length = end - start;
			setLength(String.valueOf(length));
		}catch(NumberFormatException e){
			throw new RuntimeException("잘못된 숫자 형식 에러");
		}
	}
	
	void calculateEnd(){
		try{
			int start = Integer.parseInt(getStart());
			int length = Integer.parseInt(getLength());
			int end = start + length;
			setEnd(String.valueOf(end));
		}catch(NumberFormatException e){
			throw new RuntimeException("잘못된 숫자 형식 에러");
		}
	}
}
