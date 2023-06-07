package com.alpcashierin.apiCalls.pojosModel.productResponse.registerAdminAccount;

import com.alpcashierin.apiCalls.pojosModel.productResponse.registerUserAccount.AccountRegisterResp;
import com.google.gson.annotations.SerializedName;

public class RegisterAdminAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    AccountRegisterResp data;

    public String getStatus() {
        return status;
    }

    public AccountRegisterResp getDataAdmin() {
        return data;
    }
}
