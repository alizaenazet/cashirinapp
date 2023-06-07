package com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class CategoryNameResp {
    @SerializedName("category")
    String name;
    @SerializedName("product")
    List<ProductCategoryResp> products;

    public String getName() {
        return name;
    }

    public List<ProductCategoryResp> getProducts() {
        return products;
    }
}
