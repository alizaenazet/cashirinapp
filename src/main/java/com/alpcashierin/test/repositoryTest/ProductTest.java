package com.alpcashierin.test.repositoryTest;

import com.alpcashierin.apiCalls.pojosModel.productResponse.GetProductResp;
import com.alpcashierin.apiCalls.retrofitInterface.productApi.ProductApi;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductTest {

    public void testGetProductSucces(String merchantId,String id){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://108.136.45.44:3050/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi productApi = retrofit.create(ProductApi.class);
        Call<GetProductResp> response = productApi.getProduct(merchantId,id);
        try {
            System.out.println(response.execute().body().getStatus());
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        productTest.testGetProductSucces("-Lv6cFB16m6V1Aj91uEcn","rlnYPtiGKlYq-RkBlr2Qp");
    }


}
