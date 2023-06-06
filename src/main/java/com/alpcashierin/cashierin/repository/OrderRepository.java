package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Order;

import java.util.List;

public interface OrderRepository {
    public void create(String merchantId,Order order);
    public Order getOrder(String merchantId,String id);
    public List<Order> getAll(String merchantId);
    public void finish(String merchantId,String orderId);
}
