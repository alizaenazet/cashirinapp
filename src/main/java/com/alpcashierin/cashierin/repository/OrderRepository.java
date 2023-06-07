package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Order;
import com.alpcashierin.cashierin.entity.OrderProductRequeset;

import java.io.IOException;
import java.util.List;

public interface OrderRepository {
    public void create(String merchantUsername, Order order);
    public Order getOrder(String merchantUsername,String id) throws Exception;
    public List<Order> getAll(String merchantUsername) throws Exception;
    public void finish(String merchantUsername,String orderId);
}
