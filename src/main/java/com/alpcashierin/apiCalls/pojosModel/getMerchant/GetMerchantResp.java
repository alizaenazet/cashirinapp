package com.alpcashierin.apiCalls.pojosModel.getMerchant;

import com.google.gson.annotations.SerializedName;

public class GetMerchantResp {

    @SerializedName("status")
    String status;
    @SerializedName("data")
    MerchantResp merchant;
    public String getStatus() {
        return status;
    }
    public MerchantResp getMerchant() {
        return merchant;
    }



}
