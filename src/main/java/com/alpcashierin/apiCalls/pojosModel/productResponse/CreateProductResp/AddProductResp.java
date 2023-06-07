package com.alpcashierin.apiCalls.pojosModel.productResponse.CreateProductResp;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class AddProductResp {

    @SerializedName("status")
    String status;
    @SerializedName("data")
    Map<String,String> productDataId;

    public String getStatus() {
        return status;
    }

    public Map<String, String> getProductDataId() {
        return productDataId;
    }
}
