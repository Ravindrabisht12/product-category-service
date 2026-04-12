package com.example.productcategoryservice.services;

import com.example.productcategoryservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product replaceProdut(Product product, Long id);
}
