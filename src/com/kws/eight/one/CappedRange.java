package com.kws.eight.one;

public class CappedRange extends IntRange{
	private int _cap;
	
	CappedRange(int low, int high,int cap) {
		super(low, high);
		this._cap = cap;
	}

	public int get_cap() {
		return _cap;
	}

	public void set_cap(int _cap) {
		this._cap = _cap;
	}
	
}
