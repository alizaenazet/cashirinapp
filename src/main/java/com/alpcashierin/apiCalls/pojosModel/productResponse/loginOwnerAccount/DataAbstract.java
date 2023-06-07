package com.alpcashierin.apiCalls.pojosModel.productResponse.loginOwnerAccount;

import com.alpcashierin.apiCalls.pojosModel.productResponse.loginUserAccount.AccountLoginResp;
import com.alpcashierin.cashierin.entity.Account;
import com.google.gson.annotations.SerializedName;

public class DataAbstract {
    @SerializedName("0")
    AccountLoginResp account;

    public AccountLoginResp getAccount() {
        return account;
    }
}
