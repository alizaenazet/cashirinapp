package com.alpcashierin.apiCalls.pojosModel.productResponse;
import com.google.gson.annotations.SerializedName;
public class GetProductResp {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    Product product;

    public String getStatus() {
        return status;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "GetProductResp{" +
                "status='" + status + '\'' +
                ", product=" + product +
                '}';
    }
}

class Product{
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

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", stock=" + stock +
                '}';
    }
}
