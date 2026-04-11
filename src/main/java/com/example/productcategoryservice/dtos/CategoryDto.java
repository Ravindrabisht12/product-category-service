package com.example.productcategoryservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto {
    private String title;
    private String description;
    private Long id;
}
