package com.java.collection.List.ArrayList;

import java.util.ArrayList;


//ArrayList have dynamic size 
public class ArrayList_DynamicSize_Example {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.size());
		
		list.remove(0);
		
		System.out.println(list.size());
		
	}
	
}
