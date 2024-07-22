package com.javacollections;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Hello");
		linkedList.add("baby");
		linkedList.add("rani");
		linkedList.add("pavi");
		
		linkedList.remove(0);
		System.out.println("Linkedlist after removing 0:" +linkedList);
		
		int size =linkedList.size();
		System.out.println("Size of the LinkedList: " +size);
		
		
		 for(String name:linkedList) {
			 System.out.println(name);
		 }
		
	}

}
