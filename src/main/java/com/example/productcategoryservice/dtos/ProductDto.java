package com.example.productcategoryservice.dtos;

import com.example.productcategoryservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private String sku;
    private String seller;
    private CategoryDto category;
}
