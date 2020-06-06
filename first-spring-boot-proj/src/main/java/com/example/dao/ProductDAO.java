package com.example.dao;

import java.util.List;

import com.example.model.Product;

public interface ProductDAO {
    public List<Product> getAllProduct();
    public void createProduct(Product product);

}