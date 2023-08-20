package com.neotech.review10;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsExample {

	public static void main(String[] args) {

		// Collection Framework -- All interfaces and implementations
		// Collection Interface -- Only one interface
		// Collections -- It is a helper/utility class

		Set<Integer> numbers = new HashSet<>();
		numbers.add(23);
		numbers.add(34);

		List<String> students = new LinkedList<String>();
		students.add("Mesut");
		students.add("Alban");
		students.add("Nur");
		students.add("Burhan");
		System.out.println(students);

		String first = Collections.min(students);
		System.out.println("first -> " + first);
		System.out.println("last -> " + Collections.max(students));

		Collections.sort(students);
		System.out.println(students);

		System.out.println("---------------------");

		int[] arr = { 9, 4, 2, 6, 1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
