package com.alpcashierin.cashierin.repository;


import com.alpcashierin.cashierin.entity.Order;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{
    @Override
    public void create(String merchantUsername, Order order) {

    }

    @Override
    public Order getOrder(String merchantUsername, String id) {
        return null;
    }

    @Override
    public List<Order> getAll(String merchantUsername) {
        return null;
    }

    @Override
    public void finish(String merchantUsername, String orderId) {

    }
}
