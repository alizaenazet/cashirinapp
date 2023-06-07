package com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct;
import com.google.gson.annotations.SerializedName;
public class GetProductResp {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    ProductResp product;

    public String getStatus() {
        return status;
    }

    public ProductResp getProduct() {
        return product;
    }


}


