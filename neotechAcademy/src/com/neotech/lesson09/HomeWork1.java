package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
	//Print 5 times this statement: "I love Neotech"
		
		for (int i =1; i<=5; i++) {
			System.out.println("I love Neotech");
		}
		
	//Print numbers from 1 to 50 except those that are divisible by 3.
		for(int x=1; x<=50; x++) 
		{
			if(x%3==0) 
			{
				continue;
			}
			System.out.println(x+" ");
		}System.out.println();
		
		
		
	//using while loop
	//   int i =1;
	//while(i<=50) {
			
	//		if(i%3==0){
	//			i++;
	//			continue;
	//		}else {
	//			System.out.println(i+" ");
	//		}
	//	}i++;
		
			
			
	//Write a program that asks user to enter his/her username and password until user enters them correctly.
			
			String username1 = "admin";
			String password1 = "1234";
			String user;
			String password;
			Scanner scan= new Scanner(System.in);

			boolean flag = true;
			
			
			do {
				System.out.println("Enter the username and password: ");
				user = scan.next();
				password = scan.next();
				
				if(user.equals(username1) && password.equals(password1)) {
					System.out.println("Succesfully logged in!");
					
					//break; get out of the loop, can be used with while(true)
					flag = false;
				}
				
			//while(true) always keep the loop running
			}while(flag);
			
			
			
				
			
			
	//Create a program that will be asking user to apply for a credit card 10 times.As soon you get an "yes" from a user program should stop asking.
		
	
	String input;
	for(int i=0; i<10; i++) {
		System.out.println("Do you want to apply for a credit card?");
		input=scan.next();
		
	
		if (input.equalsIgnoreCase("yes")) 
		{
			System.out.println("Great, let continuıe the application process!");
			break;
		}
	}

}
}
