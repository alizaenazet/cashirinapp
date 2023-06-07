package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {
    public Product get(String merchantId,String id) throws Exception;
    public List<Product> getAll(String merchantId);
    public  void add(String merchantId,Product product);
    public  void delete(String merchantId,String id);
    public  void edit(String merchantId,String id, Map<String,Object> changes);
    public  void updateStock(String merchantId,String id,int stock);
}
