package com.sonata.assignment.day4.class1;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	List<Student> students = new ArrayList<>();
	public List<Student> getStudent() {
		students.add(new Student(101, "Louis", 91));
		students.add(new Student(102, "Taylor", 95));
		students.add(new Student(103, "Harry", 96));
		students.add(new Student(104, "Zain", 84));
		students.add(new Student(105, "Naill", 80));
		return students;
	}
	public List<Student>getStudentsSort() {
		List<Student> students = new StudentList().getStudent();
		students.sort((o1, o2)-> o2.getMarks() - o1.getMarks());
		return students;
	}
	public static void main(String args[]) {
		System.out.println("Before Sorting \n" + new StudentList().getStudent() + "\n");
		System.out.println("After Sorting \n" + new StudentList().getStudentsSort());
	}
}