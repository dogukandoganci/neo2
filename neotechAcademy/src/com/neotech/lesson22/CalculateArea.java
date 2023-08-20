package com.neotech.lesson22;

public class CalculateArea {

	void area(int a,int b){
		System.out.println("Area of the rectangle is:"+a*b);
	}
	void area(int a) {
		System.out.println("Area of the square is:"+a*a);
	}
	void area(int a, int b, int c) {
		System.out.println("Area of the box is:"+a*b*c);
	}
}
