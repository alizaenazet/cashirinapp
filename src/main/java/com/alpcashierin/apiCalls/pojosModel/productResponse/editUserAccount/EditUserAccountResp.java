package com.alpcashierin.apiCalls.pojosModel.productResponse.editUserAccount;

import com.google.gson.annotations.SerializedName;

import java.io.Serial;
import java.util.Map;

public class EditUserAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    Map<String, Object> data;

    public String getStatus() {
        return status;
    }

    public Map<String, Object> getDataUser() {
        return data;
    }
}
