package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.productResponse.editAdminAccount.EditAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.editUserAccount.EditUserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getAdminAccount.GetAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getUserAccount.GetUserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.loginAdminAccount.LoginAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.loginOwnerAccount.LoginOwnerAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.loginUserAccount.LoginUserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.registerAdminAccount.RegisterAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.registerOwnerAccount.RegisterOwnerAccount;
import com.alpcashierin.apiCalls.pojosModel.productResponse.registerUserAccount.RegisterUserAccountResp;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface AccountApi {

    //User
    @POST("merchants/{username}/users/login")
    Call<LoginUserAccountResp> loginUser(@Path("username")String username, @Body Map<String, Object> reqBody);

    @POST("merchants/{username}/users/enroll")
    Call<RegisterUserAccountResp> registerUser(@Path("username")String username, @Body Map<String, Object> reqBody);

    @DELETE("merchants/{username}/users/id")
    Call<Void> deleteUser(@Path("username")String username, @Path("id")String id);

    @PUT("merchants/{username}/users/{id}")
    Call<EditUserAccountResp> editUser(@Path("username")String username, @Path("id") String id,@Body Map<String,Object> reqBody);

    @GET("merchants/{username}/users/{id}")
    Call<GetUserAccountResp> getUser(@Path("username")String usernameMerchant, @Path("id")String id);

    //Admin
    @POST ("merchants/{username}/admins/login")
    Call<LoginAdminAccountResp> loginAdmin(@Path("username")String usernameMerchant,@Body Map<String, Object> reqBody);

    @POST ("merchants/{username}/admins/enroll")
    Call<RegisterAdminAccountResp> registerAdmin(@Path("username")String usernameMerchant, @Body Map<String, Object> reqBody);

    @DELETE("merchants/{username}/admins/id")
    Call<Void> deleteAdmin(@Path("username")String username, @Path("id")String id);

    @PUT ("merchants/{username}/admins/{id}")
    Call<EditAdminAccountResp> editAdmin(@Path("username")String username, @Path("id") String id,@Body Map<String,Object> reqBody);

    @GET ("merchants/{username}/admins/{id}")
    Call<GetAdminAccountResp> getAdmin(@Path("username")String usernameMerchant, @Path("id")String id);

    //Owner
    @POST ("merchants/{username}/owner/login")
    Call<LoginOwnerAccountResp> loginOwner(@Path("username")String usernameMerchant, @Body Map<String, Object> reqBody);

    @POST ("merchants/{username}/owner/create")
    Call<RegisterOwnerAccount> registerOwner(@Path("username")String usernameMerchant, @Body Map<String, Object> reqBody);
}
