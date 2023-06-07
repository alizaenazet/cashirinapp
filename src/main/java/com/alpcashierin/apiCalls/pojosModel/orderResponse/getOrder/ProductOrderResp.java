package com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder;

import com.google.gson.annotations.SerializedName;

public class ProductOrderResp {
    @SerializedName("id")
    String id;
    @SerializedName("product_name")
    String name;
    @SerializedName("price")
    String price;
    @SerializedName("qty")
    int qty;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
