package com.example.productcategoryservice.controllers;

import com.example.productcategoryservice.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {

    @GetMapping("/categories")
    public ArrayList<Category> getAllCategories() {
        Category category1 = new Category();
        category1.setId("1L");

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category1);

        return categories;
    }
}
