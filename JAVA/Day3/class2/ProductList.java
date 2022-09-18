package com.sonata.assignment.day4.class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ProductList {
	List<Product> products = new ArrayList<>();
	public List<Product> getProducts() {
		products.add(new Product(101, "Spiderman Toy", 5499));
		products.add(new Product(102, "Ironman Toy", 4499));
		products.add(new Product(103, "Hulk Toy", 4599));
		products.add(new Product(104, "Captain America Toy", 3999));
		products.add(new Product(105, "Black Widow Toy", 6499));
		products.forEach(
				(Product p1)-> {
					if(p1.getProdPrice() < 0) {
						throw new RuntimeException("Price is negative");
					}
				}
		);
		return products;
	}
	public List<Product>getProductsSort() {
		List<Product> products = new ProductList().getProducts();
		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return Double.compare(o1.getProdPrice(), o2.getProdPrice());
			}
		});
		return products;
	}
	int prodSize() {
		return products.size();
	}
	public static void main(String args[]) {	
		System.out.println("\t\t - Before Sorting -\n" + new ProductList().getProducts() + "\n");
		System.out.println("\t\t - After Sorting -\n" + new ProductList().getProductsSort());
	}
}