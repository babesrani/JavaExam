package com.javacollections;

import java.util.TreeSet;

public class SetImplementation {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		set.add("Mobile");
		set.add("Vivo");
		set.add("Laptop");
		set.add("Buds");
		set.add("Laptop");
		System.out.println(set.size());
		
		System.out.println(set);
		for(String str: set) {
			System.out.println(str);
		}

	}
}


