package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Category;

import java.util.List;

public interface CategoryService {
    public void createCategory(String merchantId,String name);
    public  void deleteCategory(String merhantId, String categoryId);
    public Category getCategory(String merchantId, String categoryId);
    public List<Category> getAllCategory(String merchantId);
    public  void editCategory(String merchantId, String categoryId, String name);
}
