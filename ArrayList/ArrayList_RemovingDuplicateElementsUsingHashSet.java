package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_RemovingDuplicateElementsUsingHashSet {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<>();
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
		
		System.out.println("ArrayList with Duplicate Elements: ");
		System.out.println(listWithDuplicateElements);
		
		HashSet<String>set = new HashSet<String>(listWithDuplicateElements);
		ArrayList<String>listWithoutDuplicateElements = new ArrayList<String>(set);
		System.out.println("ArrayList After Removing  Duplicate Elemets");
		System.out.println(listWithoutDuplicateElements);
		
	}
	
}
