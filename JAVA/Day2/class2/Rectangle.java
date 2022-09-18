package com.sonata.assignment.day3.class2;

public class Rectangle extends Shape {
	Rectangle() {}
	Rectangle(float length, float width) {
		super.length = length;
		super.width = width;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Rectangle...\nDrawing with Length - " + length + "cm and Width - " + width + "cm");
	}
	@Override
	public float calcArea() {
		return length * width;
	}
	public String toString() {
		draw();
		return "Area of Rectangle - " + calcArea() + "cm\n\n";
	}
}