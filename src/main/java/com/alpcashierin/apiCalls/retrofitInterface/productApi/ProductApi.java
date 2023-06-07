package com.alpcashierin.apiCalls.retrofitInterface.productApi;

import com.alpcashierin.apiCalls.pojosModel.productResponse.GetProductResp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductApi {
    @GET("merchants/{id}/products/{productId}")
    Call<GetProductResp> getProduct(@Path("id") String id,@Path("productId") String productId);
}
