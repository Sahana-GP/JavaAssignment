package com.sonata.assignment;

public class Student {

	int stdID;
	String stdName;
	int stdClass;
	
	Student(int stdID, String stdName, int stdClass){
		System.out.println(stdID + " " + stdName + " " + stdClass);
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(123, "sahan", 8);
		Student s2 = new Student(456, "karna", 9);

	}

}