package com.sonata.jdbc.main;

import com.sonata.jdbc.DOA.impl.ProductImpl;
import com.sonata.jdbc.emodel.Product;

public class App {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductID(11);
		p1.setProductName("Earphones");
		p1.setProductPrice(4599);
		
		
		ProductImpl pt= new ProductImpl();
		System.out.println(pt.insertProd(p1));
		
	}

}
