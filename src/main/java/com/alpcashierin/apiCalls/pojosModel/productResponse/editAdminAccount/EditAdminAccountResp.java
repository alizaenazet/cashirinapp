package com.alpcashierin.apiCalls.pojosModel.productResponse.editAdminAccount;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class EditAdminAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    Map<String, Object> data;

    public String getStatus() {
        return status;
    }

    public Map<String, Object> getDataAdmin() {
        return data;
    }
}
