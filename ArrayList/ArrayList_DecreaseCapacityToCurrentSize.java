package com.java.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_DecreaseCapacityToCurrentSize {

	public static void main(String[] args) {
		ArrayList<String >list = new ArrayList<String>();
		list.ensureCapacity(20);		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		list.trimToSize();
		System.out.println(list.size());
	}
	
}
