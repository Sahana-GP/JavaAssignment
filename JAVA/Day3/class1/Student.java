package com.sonata.assignment.day4.class1;

public class Student {
	private int stdId;
	private String stdName;
	private int marks;
	public Student(int id, String name, int marks) {
		this.stdId = id;
		this.stdName = name;
		this.marks = marks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "Student ID - " + stdId + " | Student Name - " + stdName + " | Student Marks - " + marks + "\n";
	}
}