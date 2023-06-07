package com.alpcashierin.apiCalls.pojosModel.productResponse.editProductResp;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class EditProductResp {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    Map<String,Object> data;
}
