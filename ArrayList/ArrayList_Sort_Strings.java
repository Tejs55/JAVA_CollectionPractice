package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort_Strings {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		
		list.add("Joey");
		list.add("Ross");
		list.add("Chandler");
		list.add("Phoeby");
		list.add("Rechal");
		list.add("Monica");
		
		System.out.println("ArrayList Before Sorting: ");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("ArrayList After Sorintg:");
		System.out.println(list);
		
	}
	
}
