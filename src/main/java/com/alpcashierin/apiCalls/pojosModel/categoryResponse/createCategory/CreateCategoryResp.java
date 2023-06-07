package com.alpcashierin.apiCalls.pojosModel.categoryResponse.createCategory;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CreateCategoryResp {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    Map<String,Object> data;

    public String getStatus() {
        return status;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
