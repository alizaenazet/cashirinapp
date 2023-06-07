package com.alpcashierin.cashierin.repository;

import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.GetProductResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.ProductResp;
import com.alpcashierin.apiCalls.retrofitInterface.ProductApi;
import com.alpcashierin.cashierin.entity.Product;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Product get(String merchantId,String id) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://108.136.45.44:3050/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi productApi = retrofit.create(ProductApi.class);
        Call<GetProductResp> promp = productApi.getProduct(merchantId,id);

        Response<GetProductResp> response = promp.execute();
        if (response.code() == 404) throw new Exception("Product tidak ditemukan");
        ProductResp productResp = response.body().getProduct();
        Product product = new Product(productResp.getName(),productResp.getDescription(),productResp.getStock(),
                0);
        return  product;
    }

    @Override
    public List<Product> getAll(String merchantId) {
        return null;
    }

    @Override
    public void add(String merchantId,Product product) {

    }

    @Override
    public void delete(String merchantId,String id) {

    }

    @Override
    public void edit(String merchantId,String id, Map<String, Object> changes) {

    }

    @Override
    public void updateStock(String merchantId,String id, int stock) {

    }
}
