package com.neotech.review01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int number1 = input.nextInt();
		System.out.println("Please enter the second number: ");
		int number2 = input.nextInt();
		System.out.println("Please enter the operator: ");
		String operator1 = input.next();
		
		if (operator1.equals ("+")) {
			System.out.println("The result is "+ (number1 + number2));	
		}
		else if ( operator1.equals("-")) {
			System.out.println("The result is "+(number1 - number2));	
		}
		else if (operator1.equals("*")) {
			System.out.println("The result is "+(number1 * number2));
		}
		else if (operator1.equals("/")){
			System.out.println("Tahe result is " + (number1 / number2));
		}
		else {
			System.out.println("Change the input");
		}
		
		

	}

}
