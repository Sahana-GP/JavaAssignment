package com.sonata.jdbc.emodel;

public class Product {
	private int productID;
	private String productName;
	private double productPrice;
	

	public Product(int productID, String productName, double productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	

	public Product() {
		// TODO Auto-generated constructor stub
	}


	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
