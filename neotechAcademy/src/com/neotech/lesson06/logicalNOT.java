package com.neotech.lesson06;

public class logicalNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = !true;
		System.out.println(b1);
		boolean b2 = !false;
		System.out.println(!b2);
		
		System.out.println(!(6<4));
		
		boolean cold = !true;
		
		if(!cold) {
			System.out.println("Cold!");
		}
		int x =12;
		if (x == 12){
			System.out.println("x is 12");
		}
		else {
			System.out.println("x is not 12");
		}
		
		
		if (x != 12)
		{
			System.out.println("x is not 12");
		}
		
		System.out.println(!(x==12));
	}

}
