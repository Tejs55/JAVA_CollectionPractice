package com.java.collection.List.ArrayList;

import java.util.ArrayList;

//ArrayList can have any number of null elements!
public class ArrayList_NullElements_Example {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(null);
		list.add(200);
		list.add(null);
		list.add(5000);
		list.add(null);
		
		System.out.println(list);
		
	}
	
}
