package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Category;
import com.alpcashierin.cashierin.entity.Product;

import java.util.List;

public interface CategoryRepository {
    Category get(String merchantId,String categoryId);
    List<Category> getAll(String merchantId);
    void add(String merchantId,String name);
    void delete(String merchantId,String categoryId);
    void edit(String merchantId,String categoryId,String name);
    void addProduct(String merchantId, String categoryId, Product product);
}
