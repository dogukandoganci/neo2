package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {
	/*
	 * Create a Set of cities in which you want to make sure that insertion order is
	 * maintained. Using Iterator remove any city that starts with “A”;
	 */

	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();

		cities.add("Trabzon");
		cities.add("Tashkent");
		cities.add("San Diego");
		cities.add("Atlanta");
		cities.add("Calgary");
		cities.add("Berlin");
		cities.add("ankara");
		cities.add("Sofia");

		System.out.println(cities);

		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
//			String city = it.next();
//			if(city.startsWith("A")) {
//				it.remove();
//			}

			if (it.next().toUpperCase().startsWith("A")) {
				it.remove();
			}
		}

		System.out.println(cities);

	}
}
