package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Product;

import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Product get(String merchantId,String id) {
        return null;
    }

    @Override
    public List<Product> getAll(String merchantId) {
        return null;
    }

    @Override
    public void add(String merchantId,Product product) {

    }

    @Override
    public void delete(String merchantId,String id) {

    }

    @Override
    public void edit(String merchantId,String id, Map<String, Object> changes) {

    }

    @Override
    public void updateStock(String merchantId,String id, int stock) {

    }
}
