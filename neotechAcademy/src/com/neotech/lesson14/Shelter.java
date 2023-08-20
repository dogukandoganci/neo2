package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.breed="Pekingese";
		d1.color="Yellow";
		d1.size="Small";
		d1.age=7;
		
		d1.eat();
		d1.run();
		d1.breed();
		
		System.out.println(d1.color+" "+d1.breed+" is "+d1.size+" size " );
		
		Dog d2=new Dog();
		d2.breed="Golden Retriever";
		d2.color="Yellow";
		d2.size="Large";
		d2.age=11;
		
		d2.eat();
		d2.run();
		d2.breed();
		
		System.out.println(d2.color+" "+d2.breed+" is "+d2.age+" years old!");
		
		Dog d3=new Dog();
		d3.breed="Terrier";
		d3.color="White";
		d3.size="Small";
		d3.age=5;
		
		d3.eat();
		d3.run();
		d3.breed();
		
		
		System.out.println(d2.breed+"is "+d3.size+" size and "+d3.age+" years old!");
	}

}
