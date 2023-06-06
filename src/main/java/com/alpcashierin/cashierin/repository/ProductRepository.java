package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {
    public Product get(String id);
    public List<Product> getAll();
    public  void add(Product product);
    public  void delete(String id);
    public  void edit(String id, Map<String,Object> changes);
    public  void updateStock(String id,int stock);
}
