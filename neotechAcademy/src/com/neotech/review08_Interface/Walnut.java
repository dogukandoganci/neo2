package com.neotech.review08_Interface;

// in java we dont't allow multiple inheritance
// in Java we achieve multiple inheritance through interfaces :)

public class Walnut extends Fruit implements Crackable {

	public Walnut(String color) {
		super(color);

	}

	@Override
	public void crack() {
		System.out.println("Cracking the Walnut.");

	}

}
