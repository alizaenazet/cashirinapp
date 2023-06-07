package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Category;
import com.alpcashierin.cashierin.entity.Product;

import java.io.IOException;
import java.util.List;

public interface CategoryRepository {
    Category get(String merchantId,String categoryId) throws Exception;
    List<Category> getAll(String merchantId) throws Exception;
    String add(String merchantId, String name) throws Exception;

    boolean delete(String merchantId, String categoryId) throws Exception;
    void edit(String merchantId,String categoryId,String name) throws Exception;
    void addProduct(String merchantId, String categoryId, Product product) throws Exception;
}
