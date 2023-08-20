package com.neotech.lesson07;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		//At the end your program should print which grade was entered by the user with explanation.
		
		Scanner scan = new Scanner(System.in);
		String review="";
		System.out.println("Enter your grade: ");
		char grade = scan.next().charAt(0);
		
		
		switch(grade) 
		{
		case 'A':
			review = "Excellent!";
			break;
		case 'B':
			review = "Good!";
			break;
		case 'C':
			review = "Average!";
			break;
		case 'D':
			review="Bad!";
			break;
		default :
			System.out.println("Not Acceptable.");
			break;		
			
			
			
		}
		
		
		System.out.println("Your grade is "+ grade+" and you are "+ review );
		
	
		
	}

}
