package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Product;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ProductRepository {
    public Product get(String merchantId,String id) throws Exception;
    public List<Product> getAll(String merchantId) throws Exception;

    String add(String merchantId, Product product, String categoryId) throws Exception;

    public  void delete(String merchantId, String id) throws Exception;
    public  void edit(String merchantId,String id, Map<String,Object> changes) throws Exception;
    public  void updateStock(String merchantId,String id,int stock) throws Exception;
}
