package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Product;
import com.alpcashierin.cashierin.repository.ProductRepository;
import com.alpcashierin.cashierin.utilities.ServiceLocator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository;
    public ProductServiceImpl() {
        this.productRepository = ServiceLocator.getInstance().getService(ProductRepository.class);
    }

    @Override
    public void addProduct(String name, String description, Integer stock, int price) {
        if(description.isBlank() || description == null) description = "";
        if(stock == null) stock = 0;
        Product product = new Product(name,description,stock,price);
        productRepository.add(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.delete(id);
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.get(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return  productRepository.getAll();
    }

    @Override
    public void updateStockProduct(String id, int stock) {
        productRepository.updateStock(id,stock);
    }

    @Override
    public void updateProduct(String id, Map<String, Object> data) {
        productRepository.edit(id,data);
    }
}
