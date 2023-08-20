package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		// byte < short < int < long < float < double
		
		int intNumber = 34;
		double doubleNumber = intNumber;
		//double doubleNumber = (double) intNumber; => done automatically by java
		System.out.println(intNumber);
		System.out.println(doubleNumber);
		
		byte byteNumber = (byte) intNumber;
		// narrowing casting manually
		System.out.println(byteNumber);
		
		// re-assign
		intNumber = 490;
		// in this case we will lose data
		byte b2 = (byte) intNumber;
		System.out.println(b2);
		
		byte b3 = 85;
		int i3 = b3;
		System.out.println(i3);
		
		double d1 = 43.7;
		int num = (int)d1; // you may loose data
		System.out.println(num);		
	}

}
