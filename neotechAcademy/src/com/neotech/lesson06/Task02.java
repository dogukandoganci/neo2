package com.neotech.lesson06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner input;
		
		input = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int number1 = input.nextInt();
		System.out.println("Please enter the second number: ");
		int number2 = input.nextInt();
		
		if (number1 > number2) {
			System.out.println( number1 );
		}
		else {
			System.out.println( number2 );
		}
	}

}
