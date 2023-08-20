package com.neotech.lesson13;

public class Task2PrintSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {
				{88, 78, 66},
				{54, 89, 23, 98},
				{34, 99, 72, 29}
		};
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) 
		{
			for(int j=0; j<numbers[i].length; j++) 
			{
				sum+=numbers[i][j];
			}
		}
		System.out.println("The total sum is: "+sum);
		
		//using for each
		
		int sum2=0;
		
		for(int[] el: numbers) {
			for(int value : el) {
				sum2 +=value;
		}
		}
		System.out.println("The total sum is: "+sum);
	}

}
