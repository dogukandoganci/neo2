package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorWithReturn cal=new CalculatorWithReturn();
		
		int res=cal.add(6, 4);
		System.out.println(res);
		
		int res2=cal.multiply(5, 4);
		System.out.println(res2);
		
		//we are printing the result directly
		System.out.println(cal.multiply(6, 15));
		
		
		double res3=cal.divid(5.5, 2.2);
		System.out.println(res3);
		
		int num=cal.giveBackSomething();
		System.out.println(num);
		
		cal.dontGiveBackAnything();
		
		double avg=cal.average(res2,  res3, num);
		System.out.println(avg);
				
	}

}
