package com.sonata.assignment.day4.class2;

public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	public Product(int id, String name, double price) {
		this.prodId = id;
		this.prodName = name;
		this.prodPrice = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product ID - " + prodId + " | Product Name - " + prodName + " | Product Price - " + prodPrice + "\n";
	}
}
