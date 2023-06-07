package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.productResponse.CreateProductResp.AddProductResp;
import com.alpcashierin.apiCalls.pojosModel.editProductResp.EditProductResp;
import com.alpcashierin.apiCalls.pojosModel.getProduct.GetProductResp;
import com.alpcashierin.apiCalls.pojosModel.getProducts.GetProductsResp;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface ProductApi {
    @GET("merchants/{id}/products/{productId}")
    Call<GetProductResp> getProduct(@Path("id") String id,@Path("productId") String productId);
    @GET("merchants/{id}/products")
    Call<GetProductsResp> getProducts(@Path("id") String id);
    @POST("/merchants/{id}/products")
    Call<AddProductResp> createProduct(@Path("id") String id, @Body Map<String,Object> bodyReq);
    @DELETE("/merchants/{id}/products/{productId}")
    Call<Void> deleteProduct(@Path("id") String id,@Path("productId")String productId);
    @PUT("/merchants/{id}/products/{productId}")
    Call<EditProductResp> editProduct(@Path("id")String MerchantId,
        @Path("productId") String productId,@Body Map<String,Object> bodyReq);
}
