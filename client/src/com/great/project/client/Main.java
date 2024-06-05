package com.great.project.client;

import com.great.project.entity.Product;
import com.great.project.service.ProductService;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		productService.add(new Product(1, "Tablet", 200));
		productService.add(new Product(2, "Laptop", 150));

		System.out.println(productService.getAll());
	}
}
