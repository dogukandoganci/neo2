package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.println("Please enter the first number: ");
			int number1 = input.nextInt();
			System.out.println("Please enter the second number: ");
			int number2 = input.nextInt();
			System.out.println("Please enter the operator: ");
			String operator1 = input.next();
			
			double result=0;
			
			switch(operator1) {
			case "+":
				result = number1+number2;
			break;
			case "-":
				result =number1-number2;
			break;
			case"*":
				result =number1*number2;
			break;
			case "/":
				result= number1/number2;
			break;
			default:
				System.out.println("Invalid Operator");
				break;
			
			}
			System.out.println("result is: " + result);
	}

}
