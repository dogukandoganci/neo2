package com.neotech.review03;

public class MoreNumberPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row=1; row<=4; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		//1111
		//222
		//33
		//4
		
		for(int row=1; row<=4; row++) {
			for(int col=4; col>=row; col--) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		
	}

}
