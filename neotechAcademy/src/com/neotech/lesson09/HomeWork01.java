package com.neotech.lesson09;

public class HomeWork01 {

	public static void main(String[] args) {
		//1. Write a program using while loop that calculates the sum 
				//of the even numbers between 0 and 10.
				
				//naive way: 
			//	System.out.println(2 + 4 + 6 + 8 + 10);
				
				//first way: 
					//count from 0 to 10
					//check if a number is even
					//if yes, add it on the bucket
				
				int i = 0;
				int sum = 0;
				while(i<=10)
				{
				
					if (i % 2 == 0)
					{
						sum = sum + i;
						//sum+=i;
					}
					i++;
				}
				System.out.println("The sum is: " + sum);
				
				
				//2nd way: 
				//0 - 10
				//instead of going through all numbers, I want to travel only:
					// 0 2 4 6 8 10
				
				int m = 0;
				int sum2 = 0;
				while(m <= 10)
				{
					sum2+=m; //add m to the sum
					m +=2;
				}
					
	}

}
