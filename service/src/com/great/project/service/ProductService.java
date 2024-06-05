package com.great.project.service;

import com.great.project.entity.Product;
import com.great.project.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepository();

    public void add(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAll() {
        return productRepository.getProducts();
    }
}
