package com.java.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
	int id;
	String name;
	int percentage;
	
	public Student(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student s) {
		return this.id - s .id;
	}
	
	public String toString() {
		return "{ID: "+id+", Name: "+name+", Percentage: "+percentage+"}";
		
	}
}

class OrderedByPercentage implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.percentage -s1.percentage;
	}
	
}

public class ArrayList_SortingCustomObjecctsUsingComparator {

	public static void main(String[] args) {
		ArrayList<Student>listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(123,"Student1",62));
		listOfStudents.add(new Student(231,"Student2",81));
		listOfStudents.add(new Student(85,"Student3",79));
		listOfStudents.add(new Student(478,"Student4",94));
		listOfStudents.add(new Student(365,"Student5",62));
		
		System.out.println("List of Students Before Sorting");
		System.out.println(listOfStudents);
		
		Collections.sort(listOfStudents);
		System.out.println("List of Students after Sorting: ");
		System.out.println(listOfStudents);
		
	}
	
}
