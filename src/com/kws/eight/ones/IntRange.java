package com.kws.eight.ones;

public class IntRange {
	private int _low,_high;
	
	boolean includes(int arg){
		return arg >= get_low() && arg <= get_high();
	}
	
	void grow(int factor){
		this._high = get_high() * factor;
	}
	
	IntRange(int low, int high){
		initialize(low, high);
	}
	
	private void initialize(int low, int high){
		this._low = low;
		this._high = high;
	}

	public int get_low() {
		return _low;
	}

	public void set_low(int _low) {
		this._low = _low;
	}

	public int get_high() {
		return _high;
	}

	public void set_high(int _high) {
		this._high = _high;
	}
	
}
