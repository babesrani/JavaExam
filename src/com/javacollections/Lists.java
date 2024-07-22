package com.javacollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("PineApple");
		list.add("Orange");
		list.add("Guava");
		System.out.println(list);
		
		list.remove(3);
		System.out.println("List after removing 3:"  +list);
		
		int size = list.size();
		System.out.println("Size of the list:"  +size);
		
		Iterator<String> iterator = list.iterator();
		System.out.println("Elements in the list" +list);
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
	}
	
	
	
	
}

