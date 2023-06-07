package com.alpcashierin.apiCalls.pojosModel.getMerchant;

import com.google.gson.annotations.SerializedName;

public class MerchantResp {

    @SerializedName("id")
    String id;

    @SerializedName("merchant_username")
    String username;

    @SerializedName("logo_url")
    String logourl;

    @SerializedName("baner_url")
    String banerurl;

    @SerializedName("phone")
    String phone;

    public String getLogourl() {
        return logourl;
    }

    public String getBanerurl() {
        return banerurl;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "MerchantResp{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", logourl='" + logourl + '\'' +
                ", banerurl='" + banerurl + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
