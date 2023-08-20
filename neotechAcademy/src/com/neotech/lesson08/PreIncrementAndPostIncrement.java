package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		int x;
		int y =50;
		
		//post increment
		
		x=y++;
		System.out.println(x);
		System.out.println(y);
		
		int a;
		int b =15;
		
		//pre increment
		
		a=++b;
		System.out.println(a);
		System.out.println(b);
		
		int c;
		int d =14;
		
		//post decrement
		
		c=d--;
		System.out.println(c);
		System.out.println(d);
		
		int e;
		int f = 20;
		
		//pre decrement
		
		e=--f;
		System.out.println(e);
		System.out.println(f);
				

	}

}
