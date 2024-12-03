package com.java.collection.List.ArrayList;

import java.util.ArrayList;

//ArrayList Implements RandomAccess Interface can perform operations from any arbitrary position
public class ArrayList_RandomAccess_example {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.set(2, 2222);
		System.out.println();
		
		list.add(1, 1111);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
	}
	
}
