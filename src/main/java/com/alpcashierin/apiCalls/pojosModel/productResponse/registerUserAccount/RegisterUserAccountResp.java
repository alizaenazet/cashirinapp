package com.alpcashierin.apiCalls.pojosModel.productResponse.registerUserAccount;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class RegisterUserAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    AccountRegisterResp data;

    public String getStatus() {
        return status;
    }

    public AccountRegisterResp getDataUser() {
        return data;
    }
}
