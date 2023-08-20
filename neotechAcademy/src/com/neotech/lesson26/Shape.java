package com.neotech.lesson26;

public interface Shape {
	/*
	 * Create an Interface 'Shape' with undefined methods as calculateArea and
	 * calculatePerimeter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */

	void calculateArea(int r);

	void calculatePerimeter(int r);
}

class Circle implements Shape {

	@Override
	public void calculateArea(int r) {

		System.out.println("The area of the Circle is " + 3 * r * r);

	}

	@Override
	public void calculatePerimeter(int r) {
		System.out.println("The perimeter of the Circle is " + 2 * 3 * r);
	}

}

class Square implements Shape {

	@Override
	public void calculateArea(int r) {
		System.out.println("The area of the square is " + r * r);
	}

	@Override
	public void calculatePerimeter(int r) {
		System.out.println("The perimeter of the square is " + 4 * r);
	}
}
