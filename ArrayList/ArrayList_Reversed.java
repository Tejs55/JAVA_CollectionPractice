package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Reversed {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("Gold");
		list.add("Iron");
		list.add("Copper");
		list.add("Zinc");
		list.add("Cobalt");
		list.add("Nickel");
		list.add("Silver");
		list.add("Platinium");
		
		System.out.println("ArrayList Before Revers:");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("ArrayList after Reverse: ");
		System.out.println(list);
	}
	
}
