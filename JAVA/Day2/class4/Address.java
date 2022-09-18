package com.sonata.assignment.day3.class4;

public class Address {
	int doorNo;
	int pinCode;
	String street;
	String city;
	Address () {}
	Address (int doorNo , String street , String city , int pinCode) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	public String toString() {
		return doorNo+", "+street+", "+city+" - "+pinCode;
	}
}