package com.java.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_IncreaseCapacity {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.ensureCapacity(20);	
		System.out.println(list.size());

	}
	
}
