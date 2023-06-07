package com.alpcashierin.apiCalls.pojosModel.getUserAccount;

import com.google.gson.annotations.SerializedName;

public class GetUserAccountResp {

    @SerializedName("status")
    String status;

    @SerializedName("data")
    UserAccountResp data;

    public String getStatus() {
        return status;
    }

    public UserAccountResp getDataUser() {
        return data;
    }
}
