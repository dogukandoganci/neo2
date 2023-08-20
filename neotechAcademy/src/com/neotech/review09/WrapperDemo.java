package com.neotech.review09;

public class WrapperDemo {

	public static void main(String[] args) {
		int num1=5;
		
		//Integer integer1=new Integer(num1); // until java 1.8
		//Integer integer2=Integer.valueOf(num1); // Java 9 and up
		
		Integer integer1=new Integer(num1); //Boxing / Wrapping
		int num2=integer1.intValue(); //Unboxing/Unwrapping
		
		//Easy way
		int num3=8;
		Integer integer3=num3; //Auto boxing, auto wrapping
		int num4=integer3; //auto unboxing, auto unwrapping
		
		//Double wrapper
		double d1=3.5;
		double d2=d1; //auto boxing
		
		//long way
		Double d3=new Double(4.7); // Boxing
		// Short way
		Double d4=4.7; //Auto unboxing
		
		double d5=d4; //Auto unboxing
		
		Boolean b=true; //Auto boxing
		
		Character c='&'; //Auto boxing
		
		

	}

}
