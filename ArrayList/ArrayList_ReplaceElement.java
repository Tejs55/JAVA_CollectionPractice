package com.java.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_ReplaceElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(null);
		
		System.out.println(list);
		list.set(1, 0);
		list.set(4, 50);
		System.out.println(list);
	}
	
}
