package com.alpcashierin.apiCalls.pojosModel.productResponse.getAdminAccount;

import com.alpcashierin.apiCalls.pojosModel.productResponse.getUserAccount.UserAccountResp;
import com.google.gson.annotations.SerializedName;

public class GetAdminAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    UserAccountResp data;

    public String getStatus() {
        return status;
    }

    public UserAccountResp getDataAdmin() {
        return data;
    }
}
