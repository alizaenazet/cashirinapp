package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    void addProduct(String name, String description, Integer stock, int price);
    void deleteProduct(String id);
    Product getProduct(String id);
    List<Product> getAllProduct();
    void updateStockProduct(String id,int stock);
    void updateProduct(String id, Map<String, Object> data);

}
