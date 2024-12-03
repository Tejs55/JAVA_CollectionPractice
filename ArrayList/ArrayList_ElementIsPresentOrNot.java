package com.java.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_ElementIsPresentOrNot {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(null);
		list.add(11);
		list.add(10);
		list.add(66);
		list.add(55);
		list.add(9672);
		System.out.println(list.contains(55));
	}
	
}
