package com.neotech.review02;

public class Task3 {

	public static void main(String[] args) {
		int sumEven=0;
		int sumOdd=0;
		int total=0;
		
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			total +=i;
		}
		
		System.out.println("The sum of the even numbers ->" + sumEven);
		System.out.println("The sum of the odd numbers ->" + sumOdd);
		System.out.println("The sum of all numbers ->" + total);
	}

}
