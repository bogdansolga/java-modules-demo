package com.great.project.repository;

import com.great.project.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
