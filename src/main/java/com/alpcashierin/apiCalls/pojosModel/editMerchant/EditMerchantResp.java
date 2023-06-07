package com.alpcashierin.apiCalls.pojosModel.editMerchant;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class EditMerchantResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    Map<String, Object> data;

}
