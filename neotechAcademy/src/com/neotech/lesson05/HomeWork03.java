package com.neotech.lesson05;

public class HomeWork03 {

	public static void main(String[] args) {
		// Write a Java Program to check whether number is Even or Odd.
		
		int number = 34532;
		
		int remainder = number % 2;
		//1st way
		if (remainder ==0) {
			System.out.println("The number is even!");
		}
		else {
			System.out.println("The number is odd!");
		}
		
		
		//2nd way
		
		if (number %2 == 1 ) {
			System.out.println("The number is odd!");
		}
		else {
			System.out.println("The number is even!");
		}
	}

}
