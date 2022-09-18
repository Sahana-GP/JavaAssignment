package com.sonata.assignment.day3.class2;

public class Square extends Shape {
	Square() {}
	Square(float s) {
		super.side = s;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Square...\nDrawing with Side - " + side + "cm");
	}
	@Override
	public float calcArea() {
		return side * side;
	}
	public String toString() {
		draw();
		return "Area of Square - " + calcArea() + "cm\n\n";
	}
}