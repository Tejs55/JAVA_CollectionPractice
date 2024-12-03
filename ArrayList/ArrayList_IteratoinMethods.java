package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_IteratoinMethods {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("First"); 
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		
		//1.Using For Loop
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//2.Using Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		//3.Using ListIterator
		ListIterator<String> listIt= list.listIterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		//4.Using enhanced for loop
		for(String element : list) {
			System.out.println(element);
		}
		
		
	}
	
}
