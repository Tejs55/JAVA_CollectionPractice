package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{

	int id;
	String name;
	int percentage;
	
	public Students( int id, String name, int percentage){
		this.id = id;
		this.name= name;
		this.percentage = percentage;
	}
	
	@Override
	public int compareTo(Students s) {
		return this.id - s.id;
	}
	
	public String toString() {
		return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
	}
	
}

public class ArrayList_Sorting_CustomObjects {

	public static void  main(String[] args) {
		ArrayList<Students>listOFStudents = new ArrayList<Students>();
		
		listOFStudents.add(new Students(123,"Student1",65));
		listOFStudents.add(new Students(231,"Student2",75));
		listOFStudents.add(new Students(85,"Student3",94));
		listOFStudents.add(new Students(487,"Student4",79));
		listOFStudents.add(new Students(365,"Student5",62));
		
		System.out.println("listOfStudents Before Sorting:");
		System.out.println(listOFStudents);
		Collections.sort(listOFStudents);
		System.out.println("List of Students after sorting:");
		System.out.println(listOFStudents);
	}
	
}
