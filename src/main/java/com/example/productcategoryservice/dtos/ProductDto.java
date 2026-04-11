package com.example.productcategoryservice.dtos;

import com.example.productcategoryservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    Long id;
    String title;
    String description;
    String sku;
    String seller;
    CategoryDto category;
}
