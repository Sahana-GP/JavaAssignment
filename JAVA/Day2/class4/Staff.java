package com.sonata.assignment.day3.class4;

public class Staff extends Employee {
	double salary, HRA;
	String title;
	Staff() {}
	Staff(int empId, String empName, String title, double basicPay, int numofLeaves) {
		super.empId = empId;
		super.empName = empName;
		this.title = title;
		super.basicPay = basicPay;
		super.numofLeaves = numofLeaves;
	}
	public double calculateHRA() {
		HRA = 0.18 * basicPay;
		return HRA;
	}
	@Override
	public double calculateSalary() {
		salary = basicPay + HRA;
		return salary;
	}
	public String toString() {
		return "Staff Details\n\nID - " + empId + "\nName - " + empName + "\nTitle - " + title + "\nAddress - " + address + "\nBasic Pay - " + basicPay + "\nHRA - " + calculateHRA() + "\nSalary - " + calculateSalary();
	}
}