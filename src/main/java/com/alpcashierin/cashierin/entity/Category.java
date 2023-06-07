package com.alpcashierin.cashierin.entity;

import java.util.List;
import java.util.UUID;

public class Category {
    String id;
    String name;
    List<Product> productsList;

    public Category( String name, List<Product> productsList) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.productsList = productsList;
    }

    public Category( String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.productsList = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }
}
