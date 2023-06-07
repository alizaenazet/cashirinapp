package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {


    void addProduct(String merchantId, String name, String description, Integer stock, int price,String categoryId) throws Exception;


    void deleteProduct(String merchantId, String id) throws Exception;


    Product getProduct(String merchantId, String id) throws Exception;


    List<Product> getAllProduct(String merchantId) throws Exception;

    void updateStockProduct(String merchantId, String id, int stock) throws Exception;


    void updateProduct(String merchantId, String id, Map<String, Object> data) throws Exception;
}
