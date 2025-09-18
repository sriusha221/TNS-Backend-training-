package com.tnsif.collections;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Sriusha");
		hs.add("Poloju");
		hs.add("poloju");  // Set does not allow duplicates
		hs.add("KPRIT");
		System.out.println(hs);
		
		
		
		SortedSet<String> hs1 = new TreeSet<String>();  // sorting the strings by alphabetical order
		
		hs1.add("Shivapriya");
		hs1.add("Poloju");
		hs1.add("Poloju");  // Set does not allow duplicates
		hs1.add("KPRIT");
		System.out.println(hs1);
		
		hs.clear();
		hs1.clear();
	}

}