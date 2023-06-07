package com.alpcashierin.apiCalls.pojosModel.productResponse.getProducts;

import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.ProductResp;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetProductsResp {
    @SerializedName("id")
    String id;
    @SerializedName("data")
    List<ProductResp> products;

    public String getId() {
        return id;
    }

    public List<ProductResp> getProducts() {
        return products;
    }
}
