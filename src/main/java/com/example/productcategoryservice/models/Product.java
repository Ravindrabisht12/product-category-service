package com.example.productcategoryservice.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    String title;
    String description;
    String sku;
    String seller;
    Category category;
}
