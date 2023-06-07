package com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory;

import com.google.gson.annotations.SerializedName;

public class GetCategoryResp {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    CategoryNameResp category;

    public String getStatus() {
        return status;
    }

    public CategoryNameResp getCategory() {
        return category;
    }
}
