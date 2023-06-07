package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Order;
import com.alpcashierin.cashierin.entity.OrderProductRequeset;
import com.alpcashierin.cashierin.entity.Payment;
import com.alpcashierin.cashierin.entity.Product;
import com.alpcashierin.cashierin.repository.OrderRepository;
import com.alpcashierin.cashierin.utilities.ServiceLocator;

import java.util.List;

public class OrderServiceIml implements OrderService{
    OrderRepository orderRepository;

    public OrderServiceIml() {
        this.orderRepository = ServiceLocator.getInstance().getService(OrderRepository.class);
    }

    @Override
    public void createOrder(String merchantUsername, String tableNumber, String note, Integer total , String tableName, List<OrderProductRequeset> products, Payment payment, String cashierName) {
            Order order = new Order(tableNumber,tableName,note,total,payment,products,cashierName);
        orderRepository.create(merchantUsername,order);
    }

    @Override
    public void finishOrder(String merchant, String orderId) {
        orderRepository.finish(merchant,orderId);
    }

    @Override
    public Order getOrder(String merchantUsername, String orderId) throws Exception {
        return orderRepository.getOrder(merchantUsername,orderId);
    }

    @Override
    public List<Order> getAllOrders(String merchantUsername) throws Exception {
        return orderRepository.getAll(merchantUsername);
    }
}
