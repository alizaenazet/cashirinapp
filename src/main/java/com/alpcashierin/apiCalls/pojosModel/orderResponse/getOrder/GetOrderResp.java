package com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetOrderResp {
    @SerializedName("status")
    String status;

    @SerializedName("data")
    OrderResp orderResp;

    public String getStatus() {
        return status;
    }

    public OrderResp getOrderResp() {
        return orderResp;
    }
}
