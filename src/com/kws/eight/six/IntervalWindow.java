package com.kws.eight.six;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

@SuppressWarnings("serial")
public class IntervalWindow extends Frame{
	TextField _startField;
	TextField _endField;
	TextField _lengthField;
	
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
		if(isNotInteger(_startField.getText())){
			_startField.setText("0");
		}
		calculateLength();
	}
	
	void EndField_FocusLost(FocusEvent event){
		if(isNotInteger(_endField.getText())){
			_endField.setText("0");
		}
		calculateLength();
	}
	
	void LengthField_FocusLost(FocusEvent event){
		if(isNotInteger(_lengthField.getText())){
			_lengthField.setText("0");
		}
		calculateEnd();
	}

	//도메인
	void calculateLength(){
		try{
			int start = Integer.parseInt(_startField.getText());
			int end = Integer.parseInt(_endField.getText());
			int length = end - start;
			_lengthField.setText(String.valueOf(length));
		}catch(NumberFormatException e){
			throw new RuntimeException("잘못된 숫자 형식 에러");
		}
	}
	
	void calculateEnd(){
		try{
			int start = Integer.parseInt(_startField.getText());
			int length = Integer.parseInt(_endField.getText());
			int end = start + length;
			_lengthField.setText(String.valueOf(end));
		}catch(NumberFormatException e){
			throw new RuntimeException("잘못된 숫자 형식 에러");
		}
	}

}
