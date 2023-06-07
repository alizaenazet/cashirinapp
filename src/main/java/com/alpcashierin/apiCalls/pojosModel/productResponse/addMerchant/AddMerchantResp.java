package com.alpcashierin.apiCalls.pojosModel.productResponse.addMerchant;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class AddMerchantResp {

    @SerializedName("status")
    String status;

    @SerializedName("items")
    Map<String,String> merchantDataId;

    public String getStatus() {
        return status;
    }

    public Map<String, String> getMerchantDataId() {
        return merchantDataId;
    }

}

