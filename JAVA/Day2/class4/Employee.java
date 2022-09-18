package com.sonata.assignment.day3.class4;

public abstract class Employee {
	int empId,numofLeaves;
	String empName;
	double basicPay;
	Address address = new Address();
	public abstract double calculateSalary();
}
