package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortingInReverseOrder {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1452);
		list.add(6854);
		list.add(8741);
		list.add(6542);
		list.add(1234);
		list.add(3845);
		
		System.out.println("ArrayList before Sorting:");
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("ArrayList sorted in the reverse order");
		System.out.println(list);
	}
	
}
