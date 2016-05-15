package com.kws.eight;

import java.util.ArrayList;

public class Log {
	// true log show , false log hide
	public static final boolean LOGFLAG = true; 
	public static final boolean LOGLISTFLAG = true;

	public static void systemLog(StringBuffer str){
		if(LOGFLAG){
			System.out.println(str);
		}
	}
	
	public static void systemLog(String str){
		if(LOGFLAG){
			System.out.println(str);
		}
	}
	
	public static void systemLog(String str, int value){
		if(LOGFLAG){
			System.out.println(str + value);
		}
	}
	
	public static void systemLog(String str, long value){
		if(LOGFLAG){
			System.out.println(str + value);
		}
	}
	
	public static void systemLog(String str, String value){
		if(LOGFLAG){
			System.out.println(str + value);
		}
	}
	
	public static void systemLog(String str,ArrayList<?> value){
		if(LOGLISTFLAG){
			int val = value.size();
			for(int i = 0; i < val; i++){
				System.out.println(str + " =" + i + " : " + value.get(val));
			}
		}
	}
	
	public static void systemLog(ArrayList<?> value){
		if(LOGLISTFLAG){
			int val = value.size();
			for(int i = 0; i < val; i++){
				System.out.println(i + " : " + value.get(val));
			}
		}
	}
	
	public static void systemLog(String[] value){
		if(LOGLISTFLAG){
			int val = value.length;
			for(int i = 0; i < val; i++){
				System.out.println(i + " : " + value[val]);
			}
		}
	}
}
