package com.javacollections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("rose");
		set.add("Lotus");
		set.add("Jasmine");
		set.add("lilly");
		
		for(String flowers:set) {
			System.out.println(flowers);
		}
	}
}	
		
	


