package com.java.collection.List.ArrayList;

import java.util.ArrayList;

//ArrayList can have any number of duplicate elements!
public class ArrayList_DuplicateElements_Example {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(100);
		list.add(42002);
		
		System.out.println(list);
	}
	
}
