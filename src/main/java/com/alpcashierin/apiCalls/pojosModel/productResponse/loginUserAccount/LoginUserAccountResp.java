package com.alpcashierin.apiCalls.pojosModel.productResponse.loginUserAccount;

import com.google.gson.annotations.SerializedName;

public class LoginUserAccountResp {

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
