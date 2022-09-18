package com.sonata.assignment.day3.class3;

public class EmployeeException {

	public static void main(String[] args) throws MyOwnException{
		int yearlySalary = 10000;
		if(yearlySalary<100000) {
			throw new MyOwnException("Salary is less than 100000");
		}
		else {
				System.out.println("Salary is not less than 100000");
			}
	}
}