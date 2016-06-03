package com.kws.eight.six;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("serial")
public class IntervalWindowChange extends Frame implements Observer{
	
	private Interval _subject;
	
	TextField _startField;
	TextField _endField;
	TextField _lengthField;
	
	public IntervalWindowChange(){
		_subject = new Interval();
		_subject.addObserver(this);
		update(_subject, null);
	}
	
	public String getEnd(){
		return _subject.getEnd();
	}
	
	public void setEnd(String arg){
		_subject.setEnd(arg);
	}
	
	public String getStart(){
		return _subject.getStart();
	}
	
	public void setStart(String arg){
		_subject.setStart(arg);
	}
	
	public String getLength(){
		return _subject.getStart();
	}
	
	public void setLength(String arg){
		_subject.setLength(arg);
	}
	
	class SymFocus extends FocusAdapter{
		public void focusLost(FocusEvent event){
			Object object = event.getSource();
			
			if(object == _startField){
				StartField_FocusLost(event);
			}else if(object == _endField){
				EndField_FocusLost(event);
			}else if(object == _lengthField){
				LengthField_FocusLost(event);
			}
		}
	}

	private boolean isNotInteger(String text) {
		boolean result = false;
		try{
			Integer.parseInt(text);
			result = true;
		}catch(Exception e){
			
		}
		return result;
	}
	
	void StartField_FocusLost(FocusEvent event){
		if(isNotInteger(getStart())){
			setStart("0");
		}
		_subject.calculateLength();
	}
	
	void EndField_FocusLost(FocusEvent event){
		setEnd(_endField.getText());
		if(isNotInteger(getEnd())){
			setEnd("0");
		}
		_subject.calculateLength();
	}
	
	void LengthField_FocusLost(FocusEvent event){
		if(isNotInteger(getLength())){
			setLength("0");
		}
		_subject.calculateEnd();
	}

	@Override
	public void update(Observable o, Object arg) {
		_endField.setText(_subject.getEnd());
	}

}
