package com.alpcashierin.apiCalls.pojosModel.productResponse.loginOwnerAccount;

import com.alpcashierin.apiCalls.pojosModel.productResponse.loginUserAccount.AccountLoginResp;
import com.google.gson.annotations.SerializedName;

public class LoginOwnerAccountResp {


    @SerializedName("status")
    String status;

    @SerializedName("data")
    DataAbstract data;

    public String getStatus() {
        return status;
    }

    public DataAbstract getDataOwner() {
        return data;
    }
}
