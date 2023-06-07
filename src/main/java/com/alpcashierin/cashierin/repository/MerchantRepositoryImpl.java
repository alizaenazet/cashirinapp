package com.alpcashierin.cashierin.repository;

import com.alpcashierin.apiCalls.pojosModel.addMerchant.AddMerchantResp;
import com.alpcashierin.apiCalls.pojosModel.editMerchant.EditMerchantResp;
import com.alpcashierin.apiCalls.pojosModel.getMerchant.GetMerchantResp;
import com.alpcashierin.apiCalls.pojosModel.getMerchant.MerchantResp;
import com.alpcashierin.apiCalls.pojosModel.loginMerchant.LoginMerchantResp;
import com.alpcashierin.apiCalls.retrofitInterface.MerchantApi;
import com.alpcashierin.cashierin.entity.Merchant;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class MerchantRepositoryImpl implements MerchantRepository{
    String baseUrl = "http://108.136.45.44:3050/";
    @Override
    public Merchant get(String username) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MerchantApi merchantApi = retrofit.create(MerchantApi.class);
        Call<GetMerchantResp> promp = merchantApi.getMerchant(username);

        Response<GetMerchantResp> response = promp.execute();
        if (response.code() == 404) throw new Exception("Merchant tidak ditemukan");
        MerchantResp merchantResp = response.body().getMerchant();
        Merchant merchant = new Merchant(merchantResp.getId(), merchantResp.getUsername(), merchantResp.getLogourl(), merchantResp.getBanerurl(), merchantResp.getPhone());
        return  merchant;
    }

    @Override
    public String add(Merchant merchant) throws Exception {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MerchantApi merchantApi = retrofit.create(MerchantApi.class);

        Map<String,Object> bodyReq = new HashMap<>();
        bodyReq.put("username", merchant.getUsername());
        bodyReq.put("password",merchant.getPassword());
        bodyReq.put("merchant_name",merchant.getName());
        Call<AddMerchantResp> promp = merchantApi.createMerchant(bodyReq);
        Response<AddMerchantResp> response = promp.execute();
        if (response.code() == 422) throw new Exception("Validation Failed");
        return response.body().getMerchantDataId().get("merchant_id");
    }

    @Override
    public void edit(String username, Map<String, Object> changes) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MerchantApi merchantApi = retrofit.create(MerchantApi.class);

        Call<EditMerchantResp> promp = merchantApi.editMerchant(username,changes);
        Response<EditMerchantResp> response = promp.execute();
        if(response.code() == 422) throw new Exception("Gagal mengedit");

    }

    @Override
    public String loginMerchant(String username, String password) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MerchantApi merchantApi = retrofit.create(MerchantApi.class);
        Map<String, Object> merchantTemp = new HashMap<>();
        merchantTemp.put("password", password);

        Call<LoginMerchantResp> promp = merchantApi.loginMerchant(username, merchantTemp);
        Response<LoginMerchantResp> response = promp.execute();
        if(response.code() == 401) throw new Exception("Rejected");
        return (String) response.body().getData().get("id");
    }
}
