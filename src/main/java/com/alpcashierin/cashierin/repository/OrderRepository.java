package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Order;

import java.util.List;

public interface OrderRepository {
    public void create(String merchantUsername,Order order);
    public Order getOrder(String merchantUsername,String id);
    public List<Order> getAll(String merchantUsername);
    public void finish(String merchantUsername,String orderId);
}
