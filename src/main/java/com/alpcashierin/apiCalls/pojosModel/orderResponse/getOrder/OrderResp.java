package com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderResp {
    @SerializedName("no_order")
    String orderNumber;
    @SerializedName("no_meja")
    String tableNumber;
    @SerializedName("atas_nama")
    String tableName;
    @SerializedName("merchant")
    String merchantName;
    @SerializedName("note")
    String note;
    @SerializedName("date")
    String date;
    @SerializedName("total")
    String total;
    @SerializedName("payment")
    String payment;
    @SerializedName("status")
    String status;


    @SerializedName("products")
    List<ProductOrderResp> products;

    public List<ProductOrderResp> getProducts() {
        return products;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public String getTableName() {
        return tableName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public String getNote() {
        return note;
    }

    public String getDate() {
        return date;
    }

    public String getTotal() {
        return total;
    }

    public String getPayment() {
        return payment;
    }

    public String getStatus() {
        return status;
    }
}
