package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Category;
import com.alpcashierin.cashierin.repository.CategoryRepository;
import com.alpcashierin.cashierin.utilities.ServiceLocator;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{
    CategoryRepository categoryRepository;

    public CategoryServiceImpl() {
        this.categoryRepository = ServiceLocator.getInstance().getService(CategoryRepository.class);
    }

    @Override
    public void createCategory(String merchantId, String name) throws Exception {
        categoryRepository.add(merchantId,name);
    }

    @Override
    public void deleteCategory(String merchantId, String categoryId) {
            categoryRepository.delete(merchantId,categoryId);
    }

    @Override
    public Category getCategory(String merchantId, String categoryId) throws Exception {
        return categoryRepository.get(merchantId,categoryId);
    }

    @Override
    public List<Category> getAllCategory(String merchantId) throws Exception {
        return categoryRepository.getAll(merchantId);
    }

    @Override
    public void editCategory(String merchantId, String categoryId, String name) {
        categoryRepository.edit(merchantId,categoryId,name);
    }
}
