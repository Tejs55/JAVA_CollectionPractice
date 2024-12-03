package com.java.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_WaysToConstruct {

	public static void main(String[] args) {
		
		//Empty arrayList with initial capacity 10
		ArrayList<Integer> list1 = new ArrayList<>();
		
		//Empty arrayList with initial capacity 20
		ArrayList<String> list2 = new ArrayList<>(20);
		
		//Arraylist with elements of suppliedCollection
		ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
	} 
	
}
