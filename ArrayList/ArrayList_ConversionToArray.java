
package com.java.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_ConversionToArray {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("Spring");
		list.add("SpringBoot");
		list.add("Microservices");
		
		System.out.println(list);
		
		Object [] array = list.toArray();
		
		for(Object object : array) {
			System.out.println(object);
		}
		
	}
	
}
