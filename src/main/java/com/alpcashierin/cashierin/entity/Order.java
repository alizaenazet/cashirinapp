package com.alpcashierin.cashierin.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Order {
    String orderNumber;
    String tableNumber;
    String orderName;
    String note;
    LocalDate date;
    int total;
    Payment payment;
    Status status;
    String cashierName;

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    List<Product> products;

    public Order( String tableNumber, String orderName, String note, int total, Payment payment,List<Product> products,String cashiername) {
        this.orderNumber = UUID.randomUUID().toString();
        this.tableNumber = tableNumber;
        this.orderName = orderName;
        this.note = note;
        this.date = LocalDate.now();
        this.total = total;
        this.payment = payment;
        this.status = Status.PROCESS;
        this.products = products;
        this.cashierName = cashiername;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
