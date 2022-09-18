package com.sonata.assignment.day3.class2;

public class Triangle extends Shape {
	Triangle() {}
	Triangle(float height, float base) {
		super.height = height;
		super.base = base;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Triangle...\nDrawing with Height - " + height + "cm and Base - " + base + "cm");
	}
	@Override
	public float calcArea() {
		return (height * base)/2;
	}
	public String toString() {
		draw();
		return "Area of Triangle - " + calcArea() + "cm\n\n";
	}
}