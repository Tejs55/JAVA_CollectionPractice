package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_PosotionOfElement {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("Spring");
		list.add("MicreServices");
		list.add("Hibernate");
		list.add("J2EE");
		
		System.out.println(list);
		System.out.println(list.indexOf("Spring"));
		System.out.println(list.lastIndexOf("J2EE"));
	}
	
}
