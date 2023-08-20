package com.neotech.lesson02;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int num1, num2;
		num1 = 23;
		num2 = 5;
		
		int sum = num1 + num2;
		int sub = num1 - num2 ;
		int mult = num1 * num2 ;
		int div = num1 / num2 ;
		
		
		System.out.println("sum -> " + sum);
		System.out.println("sun -> " + sub);
		System.out.println("mult -> " + mult);
		System.out.println("div -> " + div);
		
		double d1, d2;
		
		d1 = 23;
		d2 = 5;
		double double_result = d1 / d2;
		System.out.println("double_result -> "+ double_result );
		
		double int_result = num1 / num2;
		System.out.println("int_result -> " + int_result);
		
		
		
	}

}
