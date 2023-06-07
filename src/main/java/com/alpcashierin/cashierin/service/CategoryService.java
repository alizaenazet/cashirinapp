package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Category;

import java.util.List;

public interface CategoryService {
    public void createCategory(String merchantId,String name) throws Exception;
    public  void deleteCategory(String merhantId, String categoryId) throws Exception;
    public Category getCategory(String merchantId, String categoryId) throws Exception;
    public List<Category> getAllCategory(String merchantId) throws Exception;
    public  void editCategory(String merchantId, String categoryId, String name) throws Exception;
}
