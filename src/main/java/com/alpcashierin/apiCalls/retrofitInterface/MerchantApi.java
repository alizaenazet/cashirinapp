package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.addMerchant.AddMerchantResp;
import com.alpcashierin.apiCalls.pojosModel.editMerchant.EditMerchantResp;
import com.alpcashierin.apiCalls.pojosModel.getMerchant.GetMerchantResp;
import com.alpcashierin.apiCalls.pojosModel.loginMerchant.LoginMerchantResp;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface MerchantApi {
    @GET("/merchants/{username}/profile")
    Call<GetMerchantResp> getMerchant(@Path("username") String username);

    @POST("/merchants/signup")
    Call<AddMerchantResp> createMerchant(@Body Map<String, Object> bodyReq);

    @PUT("/merchants/{username}/profile")
    Call<EditMerchantResp> editMerchant(@Path("username") String username, @Body Map<String, Object> bodyReq);

    @POST("/merchants/login/{username}")
    Call<LoginMerchantResp> loginMerchant(@Path("username")String username, @Body Map<String, Object> password);
}
