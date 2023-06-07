package com.alpcashierin.apiCalls.pojosModel.registerUserAccount;

import com.google.gson.annotations.SerializedName;

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
