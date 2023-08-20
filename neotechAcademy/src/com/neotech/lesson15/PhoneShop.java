package com.neotech.lesson15;

public class PhoneShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1=new Phone();
		p1.make="Iphone";
		p1.model="12 pro";
		p1.color="Space gray";
		p1.year=2020;
		
		p1.videoRecord();
		p1.battery();
		
		System.out.println(p1.color+" "+p1.make+" "+p1.model+" released in "+p1.year);
		
		
		Phone p2=new Phone();
		p2.make="Samsung";
		p2.model="Galaxy s20";
		p2.color="Black";
		p2.year=2020;
		
		p2.videoRecord();
		p2.battery();
		
		System.out.println(p2.color+" "+p2.make+" "+p2.model+" released in "+p2.year);
		
		Phone p3=new Phone();
		p3.make="Nokia";
		p3.model="Xperia";
		p3.color="White";
		p3.year=2010;
		
		p3.videoRecord();
		p3.battery();
		
		
		System.out.println(p3.color+" "+p3.make+" "+p3.model+" released in "+p3.year);
	}

}
