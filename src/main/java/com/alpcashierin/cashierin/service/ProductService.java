package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {


    void addProduct(String merchantId, String name, String description, Integer stock, int price);


    void deleteProduct(String merchantId, String id);


    Product getProduct(String merchantId, String id);


    List<Product> getAllProduct(String merchantId);

    void updateStockProduct(String merchantId, String id, int stock);


    void updateProduct(String merchantId, String id, Map<String, Object> data);
}
