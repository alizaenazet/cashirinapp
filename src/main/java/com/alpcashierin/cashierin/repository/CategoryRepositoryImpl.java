package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Category;
import com.alpcashierin.cashierin.entity.Product;

import java.util.List;

public class CategoryRepositoryImpl implements  CategoryRepository{
    @Override
    public Category get(String merchantId, String categoryId) {
        return null;
    }

    @Override
    public List<Category> getAll(String merchantId) {
        return null;
    }

    @Override
    public void add(String merchantId, String name) {

    }

    @Override
    public void delete(String merchantId, String categoryId) {

    }

    @Override
    public void edit(String merchantId, String categoryId, String name) {

    }

    @Override
    public void addProduct(String merchantId, String categoryId, Product product) {

    }
}
