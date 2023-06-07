package com.alpcashierin.cashierin.repository;


import com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder.GetAllOrders;
import com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder.GetOrderResp;
import com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder.OrderResp;
import com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder.ProductOrderResp;
import com.alpcashierin.apiCalls.retrofitInterface.OrderApi;
import com.alpcashierin.cashierin.entity.Order;
import com.alpcashierin.cashierin.entity.OrderProductRequeset;
import com.alpcashierin.cashierin.entity.Payment;
import com.alpcashierin.cashierin.entity.Product;
import com.alpcashierin.cashierin.utilities.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{
    String baseUrl = "http://108.136.45.44:3050/";


    @Override
    public void create(String merchantUsername, Order order) {

    }

    @Override
    public Order getOrder(String merchantUsername, String id) throws Exception {
        OrderApi orderApi = RetrofitConfig.config(baseUrl).create(OrderApi.class);
        Call<GetOrderResp> promp = orderApi.getOrder(merchantUsername,id);
        Response<GetOrderResp> response = promp.execute();
        if (response.code() == 404) throw new Exception("user tidak ditemukan");
        OrderResp orderResp = response.body().getOrderResp();
        System.out.println(response.code());
        List<OrderProductRequeset> orders = new ArrayList<>();
        List<ProductOrderResp> orderProducts = orderResp.getProducts();
        orderProducts.forEach(product -> {
            OrderProductRequeset orderProductRequeset = new OrderProductRequeset(product.getId(),product.getName(),((int)Double.parseDouble(product.getPrice())),product.getQty());
            orders.add(orderProductRequeset);
            ;});
        Payment paymentchoice = Payment.CASH ;
        if (orderResp.getPayment().equals("QRIS")){
            paymentchoice = Payment.QRIS;
        }
        Order order = new Order(orderResp.getOrderNumber(),orderResp.getTableNumber(),orderResp.getTableName(),
                orderResp.getNote(),((int)Double.parseDouble(orderResp.getTotal())),
                paymentchoice,orders,"");
        return order;
    }

    @Override
    public List<Order> getAll(String merchantUsername) throws Exception {
        OrderApi orderApi = RetrofitConfig.config(baseUrl).create(OrderApi.class);
        Call<GetAllOrders> promp = orderApi.getAllOrders(merchantUsername);
        Response<GetAllOrders> response = promp.execute();
        if (response.code() == 404) throw  new Exception("merchant tidak ada");


        List<Order> ordersResult = new ArrayList<>();
        List<OrderResp> orderResps = response.body().getOrders();

        for (int i = 0; i < orderResps.size() ; i++) {
            OrderResp orderResp = orderResps.get(i);
            List<OrderProductRequeset> orders = new ArrayList<>();
            List<ProductOrderResp> orderProducts = orderResp.getProducts();
            orderProducts.forEach(product -> {
                OrderProductRequeset orderProductRequeset = new OrderProductRequeset(product.getId(),product.getName(),((int)Double.parseDouble(product.getPrice())),product.getQty());
                orders.add(orderProductRequeset);
                ;});
            Payment paymentchoice = Payment.CASH ;
            if (orderResp.getPayment().equals("QRIS")){
                paymentchoice = Payment.QRIS;
            }
            Order order = new Order(orderResp.getOrderNumber(),orderResp.getTableNumber(),orderResp.getTableName(),
                    orderResp.getNote(),((int)Double.parseDouble(orderResp.getTotal())),
                    paymentchoice,orders,"");
            ordersResult.add(order);
        }
        return ordersResult;
    }

    @Override
    public void finish(String merchantUsername, String orderId) {

    }
}
