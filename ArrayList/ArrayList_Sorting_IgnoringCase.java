package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting_IgnoringCase {

	public static void main(String[] args) {
		
	ArrayList<String>list = new ArrayList<>();
	list.add("Ted");
	list.add("Martial");
	list.add("Barney");
	list.add("Robin");
	list.add("Lily");
	list.add("Victoria");
	
	System.out.println("ArrayList Before Sorting: ");
	System.out.println(list);
	Collections.sort(list);
	System.out.println("ArrayList After Sorting :");
	System.out.println(list);
		
	}
	
}
