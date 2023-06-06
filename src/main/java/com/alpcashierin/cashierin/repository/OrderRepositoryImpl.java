package com.alpcashierin.cashierin.repository;


import com.alpcashierin.cashierin.entity.Order;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{
    @Override
    public void create(String merchantId, Order order) {

    }

    @Override
    public Order getOrder(String merchantId, String id) {
        return null;
    }

    @Override
    public List<Order> getAll(String merchantId) {
        return null;
    }

    @Override
    public void finish(String merchantId, String orderId) {

    }
}
