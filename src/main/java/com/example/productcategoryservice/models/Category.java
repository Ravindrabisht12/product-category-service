package com.example.productcategoryservice.models;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Category extends BaseModel{
    String title;
    String description;
    List<Product> products;
}
