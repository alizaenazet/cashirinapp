package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.categoryResponse.createCategory.CreateCategoryResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.GetCagoriesResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.GetCategoryResp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface CategoryApi {
    @GET("/merchants/{id}/categories/{categoryId}")
    Call<GetCategoryResp> getCategory(@Path("id")String merchantId, @Path("categoryId")String categoryId);

    @GET("/merchants/{id}/categories")
    Call<GetCagoriesResp> getAllCategories(@Path("id")String merchantId);

    @POST("/merchants/{id}/categories")
    Call<CreateCategoryResp> createCategory(@Path("id") String id, @Body Map<String,Object> data);
}

