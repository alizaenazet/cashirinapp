package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Product;
import com.alpcashierin.cashierin.repository.ProductRepository;
import com.alpcashierin.cashierin.utilities.ServiceLocator;

import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository;
    public ProductServiceImpl() {
        this.productRepository = ServiceLocator.getInstance().getService(ProductRepository.class);
    }

    @Override
    public void addProduct(String merchantId, String name, String description, Integer stock, int price,String categoryId) throws Exception {
        if(description.isBlank() || description == null) description = "";
        if(stock == null) stock = 0;
        Product product = new Product(name,description,stock,price);
        if (categoryId.isBlank()) categoryId = "";
        productRepository.add(merchantId,product,categoryId);
    }

    @Override
    public void deleteProduct(String merchantId, String id) throws Exception {
        productRepository.delete(merchantId,id);
    }

    @Override
    public Product getProduct(String merchantId, String id) throws Exception {
        return productRepository.get(merchantId,id);
    }

    @Override
    public List<Product> getAllProduct(String merchantId) throws Exception {
        return  productRepository.getAll(merchantId);
    }

    @Override
    public void updateStockProduct(String merchantId, String id, int stock) throws Exception {
        productRepository.updateStock(merchantId,id,stock);
    }

    @Override
    public void updateProduct(String merchantId,String id, Map<String, Object> data) throws Exception {
        productRepository.edit( merchantId,id,data);
    }
}
