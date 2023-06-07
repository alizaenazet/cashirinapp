package com.alpcashierin.cashierin.entity;

import java.util.UUID;

public class Product {
    String id;
    String name;
    String description;
    int stock = 0;
    int Price;

    public Product(String id, String name, String description, int stock, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        Price = price;
    }

    public Product( String name, String description, int stock, int price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.stock = stock;
        Price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
