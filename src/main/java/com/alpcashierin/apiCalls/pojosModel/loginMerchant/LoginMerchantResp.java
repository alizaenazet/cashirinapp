package com.alpcashierin.apiCalls.pojosModel.loginMerchant;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class LoginMerchantResp {

    @SerializedName("status")
    String status;

    @SerializedName("items")
    Map<String, Object> data;

    public String getStatus() {
        return status;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
