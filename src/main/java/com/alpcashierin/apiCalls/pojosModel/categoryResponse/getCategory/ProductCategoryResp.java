package com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory;

import com.google.gson.annotations.SerializedName;

public class ProductCategoryResp {
    @SerializedName("category")
    String category;
    @SerializedName("id")
    String id;
    @SerializedName("name")
    String name;
    @SerializedName("description")
    String description;
    @SerializedName("price")
    String price;
    @SerializedName("category_id")
    String categoryId;
    @SerializedName("merchant_id")
    String merchantId;
    @SerializedName("stock")
    int stock;


    public String getCategory() {
        return category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public int getStock() {
        return stock;
    }
}
