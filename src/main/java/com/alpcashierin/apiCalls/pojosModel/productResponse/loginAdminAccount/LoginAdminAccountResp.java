package com.alpcashierin.apiCalls.pojosModel.productResponse.loginAdminAccount;

import com.alpcashierin.apiCalls.pojosModel.productResponse.loginUserAccount.AccountLoginResp;
import com.google.gson.annotations.SerializedName;

public class LoginAdminAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    AccountLoginResp data;

    public String getStatus() {
        return status;
    }

    public AccountLoginResp getDataUser() {
        return data;
    }
}
