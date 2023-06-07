package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.categoryResponse.createCategory.CreateCategoryResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.GetCagoriesResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.GetCategoryResp;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface CategoryApi {
    @GET("/merchants/{id}/categories/{categoryId}")
    Call<GetCategoryResp> getCategory(@Path("id")String merchantId, @Path("categoryId")String categoryId);

    @GET("/merchants/{id}/categories")
    Call<GetCagoriesResp> getAllCategories(@Path("id")String merchantId);

    @POST("/merchants/{id}/categories")
    Call<CreateCategoryResp> createCategory(@Path("id") String id, @Body Map<String,Object> data);
    @DELETE("/merchants/{id}/categories/{categoryId}")
    Call<Void> deleteCategory(@Path("id") String merchantId, @Path("categoryId") String categoryId);

    @PUT("/merchants/{id}/categories/{categoryId}")
    Call<Void> editCategory(@Path("id") String merchantId,@Path("categoryId")String categoryId, @Body Map<String,Object> bodyReq);

    @POST("/merchants/{id}/categories/{categoryId}/add")
    Call<Void> addProductCategory(@Path("id")String merchantId,@Path("categoryId")String categoryId,@Body Map<String,Object> bodyReq);
}

