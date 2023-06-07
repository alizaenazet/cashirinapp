package com.alpcashierin.apiCalls.pojosModel.getAdminAccount;

import com.alpcashierin.apiCalls.pojosModel.getUserAccount.UserAccountResp;
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
