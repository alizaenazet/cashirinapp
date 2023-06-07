package com.alpcashierin.apiCalls.pojosModel.loginOwnerAccount;

import com.alpcashierin.apiCalls.pojosModel.loginUserAccount.AccountLoginResp;
import com.google.gson.annotations.SerializedName;

public class DataAbstract {
    @SerializedName("0")
    AccountLoginResp account;

    public AccountLoginResp getAccount() {
        return account;
    }
}
