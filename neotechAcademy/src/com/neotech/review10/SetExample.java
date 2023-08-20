package com.neotech.review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	//Collection
	//List | Set | Queue | (Three interfaces inheriting Collection)
	
	//ArrayList | LinkedList (Two classes implementing List Interface)
	//HashSet | LinkedHashSet | TreeSet (Three classes implementing Set Interface)
	
	//1. List preserves the insertion order, but SET does NOT
	//2. List contains duplicates, but SET contains UNIQUE object
	
	public static void main(String[] args) {
		
		Set<String> africaLinked= new LinkedHashSet<>();
		
		africaLinked.add("Morocco");
		africaLinked.add("Egypt");
		africaLinked.add("Senegal");
		
		System.out.println("Size --> "+ africaLinked.size());
		
		//It will not add in the Set, because it already exist.
		boolean added=africaLinked.add("Egypt");
		
		System.out.println("Size --> "+ africaLinked.size());
		
		//Can i add with index in a Set? --> NO
		//africaLinked.add(0, "Kenya");
		//NOT possible set does not have index
		
		System.out.println("LinkedHashSet ->"+africaLinked);
		
		Set<String> africaHash=new HashSet<>(africaLinked);
		System.out.println("HashSet -> "+africaHash);
		
		Set<String> africaTree= new TreeSet<>();
		africaTree.addAll(africaLinked);
		System.out.println("TreeSet -> "+ africaTree);
		
		int size = africaHash.size();
		boolean contains=africaHash.contains("China");
		boolean isEmpty=africaHash.isEmpty();
		boolean ableToRemove=africaHash.remove("Egypt");
		
		System.out.println("I was able to remove China -> "+ableToRemove);
		
		//Note: We are NOT able to get/add/remove by index in a SET
		//africaHash.get(1);
		
		System.out.println("---1st way , for loop DOES NOT work in a SET ---");
		
		
		//Task
		//Iterate africaHash using enhanced for loop and iterator
		
		for(String africa: africaHash) {
			System.out.print(africa+" ");
		}
		System.out.println();
		
		Iterator<String> it=africaHash.iterator();
		
		while(it.hasNext()) {
			String african=it.next();
			System.out.print(african+" ");
		}
		
		
		
		
		
		
		
	}

}
