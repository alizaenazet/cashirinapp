package com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCagoriesResp {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    List<CategoryNameResp> cagories;

    public String getStatus() {
        return status;
    }

    public List<CategoryNameResp> getCagories() {
        return cagories;
    }
}
