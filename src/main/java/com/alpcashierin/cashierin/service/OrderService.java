package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Order;
import com.alpcashierin.cashierin.entity.Payment;
import com.alpcashierin.cashierin.entity.Product;

import java.util.List;

public interface OrderService {
    public void  createOrder(String merchantUsername, String tableNumber,String note,Integer total ,String tableName, List<Product> products, Payment payment, String cashierName);

    public void finishOrder(String merchantUsername, String orderId);
    public Order getOrder(String merchantUsername, String orderId);
    public  List<Order> getAllOrders(String merchantUsername);


}
