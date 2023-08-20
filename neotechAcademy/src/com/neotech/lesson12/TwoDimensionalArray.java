package com.neotech.lesson12;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] numbers=new int[2][4]; //[rows] [columns]
		
		//1st row, row with index 0
		numbers[0][0]=10;
		numbers[0][1]=15;
		numbers[0][2]=20;
		numbers[0][3]=25;
		
		numbers[1][0]=33;
		numbers[1][1]=36;
		numbers[1][2]=39;
		numbers[1][3]=42;
		
		System.out.println("How can i print 39");
		System.out.println(numbers[1][2]);
		
		int[][] nums= {
				{3,6,9,12},
				{5,10,15,20},
				{18,19,27,36}
				
		};
		System.out.println("How can i print 36");
		System.out.println(nums[2][3]);
		
		//reassigning values
		nums[2][3]=39;

	}

}
