package com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder;

import com.alpcashierin.cashierin.entity.Order;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAllOrders {

    @SerializedName("status")
    String status;
    @SerializedName("data")
    List<OrderResp> orders;

    public String getStatus() {
        return status;
    }

    public List<OrderResp> getOrders() {
        return orders;
    }
}
