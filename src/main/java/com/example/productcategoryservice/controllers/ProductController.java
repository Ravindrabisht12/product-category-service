package com.example.productcategoryservice.controllers;

import com.example.productcategoryservice.dtos.ProductDto;
import com.example.productcategoryservice.models.Product;
import com.example.productcategoryservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET /products
    @GetMapping("/products")
    public List<ProductDto> getAllProducts(){
        ProductDto product1 = new ProductDto();
        product1.setId(39L);
        product1.setTitle("Iphone B1");
        List<ProductDto> products = new ArrayList<>();
        products.add(product1);
        return products;
    }

    @GetMapping("/products/{id}")
    public ProductDto getProductById(@PathVariable("id") Long productId){
        /**
         * Use @PathVariable to get the productId from the URL and return a ProductDto with the given Id.
         * No need to pass variable in PathVariable as it will be automatically mapped to the method parameter with the same name.
         */
        ProductDto product1 = new ProductDto();
        product1.setId(productId);
        return product1;
    }

    @PostMapping("/products")
    public ProductDto createProduct(@RequestBody ProductDto input){
        return input;
    }
}
