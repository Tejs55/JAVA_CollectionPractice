package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayList_RemovingDuplicateElementsUsingLinkedHashSet {

	public static void main(String[] args) {
		
		ArrayList<String> listWithDuplicateElements  = new ArrayList<>();
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
		
		System.out.println("ArrayList with DuplicaeElememts");
		System.out.println(listWithDuplicateElements);
		
		LinkedHashSet<String> set = new LinkedHashSet<>(listWithDuplicateElements);
		
		ArrayList<String> listwithoutDuplicateElements = new ArrayList<>(set);
		
		System.out.println("ArrayList without duplicate elements :");
		System.out.println(listwithoutDuplicateElements);
		
	}
	
}
