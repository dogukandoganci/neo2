package com.neotech.review04;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] nums= {
				{3,9},
				{4,6,8,2},
				{7}
		};
		
		System.out.println(nums[1][3]);
		System.out.println(nums[2][0]);
		
		System.out.println("The numbers of the row is--> "+nums.length);
		System.out.println("The length of row with index number 1---> "+nums[1].length);
		
		System.out.println("-------------");
		
		for(int row=0; row<nums.length; row++) {
			//nums[row].length will give you the length of that specific row
			
			for(int col=0; col<nums[row].length; col++) {
				System.out.print(nums[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		//nested enchanced for loop
		for(int[] row: nums) {
			for(int element: row) {
				System.out.print(element+ " ");
				
			}
			System.out.println();
		}
		
		System.out.println("--------*******-------");
		//task: find the biggest number in a 2D array
		
		int[][] nums2= {
				{3,8,10},
				{4,6,8,2},
				{7,12,5},
				{1,11}
		};
		int max = nums2[0][0];
		for(int[] row: nums2) {
			for(int element: row) {
				if(element>max) {
					max=element;
					
				}
			}
			
		}
		System.out.print("Max number is--> "+max);
		
	}

}
