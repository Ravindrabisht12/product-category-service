package com.example.productcategoryservice.models;

import java.util.List;

public class Category extends BaseModel{
    String title;
    String description;
    List<Product> products;
}
