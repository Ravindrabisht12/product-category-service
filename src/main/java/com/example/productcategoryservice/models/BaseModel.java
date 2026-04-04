package com.example.productcategoryservice.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseModel {
    String Id;

    String createdAt;

    String updatedAt;

    State state;  // For soft delete
}
