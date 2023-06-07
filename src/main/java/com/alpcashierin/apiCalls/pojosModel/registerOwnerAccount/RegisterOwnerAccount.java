package com.alpcashierin.apiCalls.pojosModel.registerOwnerAccount;

import com.alpcashierin.apiCalls.pojosModel.registerUserAccount.AccountRegisterResp;
import com.google.gson.annotations.SerializedName;

public class RegisterOwnerAccount {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    AccountRegisterResp data;

    public String getStatus() {
        return status;
    }

    public AccountRegisterResp getDataOwner() {
        return data;
    }
}
