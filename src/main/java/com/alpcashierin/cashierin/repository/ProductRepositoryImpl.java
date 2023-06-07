package com.alpcashierin.cashierin.repository;

import com.alpcashierin.apiCalls.pojosModel.productResponse.CreateProductResp.AddProductResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.editProductResp.EditProductResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.GetProductResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.ProductResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getProducts.GetProductsResp;
import com.alpcashierin.apiCalls.retrofitInterface.ProductApi;
import com.alpcashierin.cashierin.entity.Product;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository{
    String baseUrl = "http://108.136.45.44:3050/";

    @Override
    public Product get(String merchantId,String id) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi productApi = retrofit.create(ProductApi.class);
        Call<GetProductResp> promp = productApi.getProduct(merchantId,id);

        Response<GetProductResp> response = promp.execute();
        if (response.code() == 404) throw new Exception("Product tidak ditemukan");
        ProductResp productResp = response.body().getProduct();
        Product product = new Product(productResp.getName(),productResp.getDescription(),
                productResp.getStock(), ((int)Double.parseDouble(productResp.getPrice())));
        return  product;
    }

    @Override
    public List<Product> getAll(String merchantId) throws Exception {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    ProductApi productApi = retrofit.create(ProductApi.class);
    Call<GetProductsResp> prom = productApi.getProducts(merchantId);
    Response<GetProductsResp> response  = prom.execute();
    if (response.code() == 400) throw new Exception("merchant tidak ditemukan");
    List<Product> products = new ArrayList<>();
        response.body().getProducts().forEach(productResp -> {
            Product product = new Product(productResp.getId(),productResp.getName(),productResp.getDescription()
                    ,productResp.getStock(),((int)Double.parseDouble(productResp.getPrice())));
            products.add(product);
        });
        return products;
    }

    @Override
    public String add(String merchantId, Product product, String categoryId) throws Exception {
        if (categoryId.isBlank()) categoryId = "";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi productApi = retrofit.create(ProductApi.class);

        Map<String,Object> bodyReq = new HashMap<>();
        bodyReq.put("prdouct_name",product.getName());
        bodyReq.put("description",product.getDescription());
        bodyReq.put("price",String.valueOf(product.getPrice()));
        bodyReq.put("category_id",categoryId);
        Call<AddProductResp> promp = productApi.createProduct(merchantId,bodyReq);
        Response<AddProductResp> response = promp.execute();
        System.out.println(response.toString());
        if (response.code() == 400) throw new Exception("Ada yang salah");
        return response.body().getProductDataId().get("product_id");
    }

    @Override
    public void delete(String merchantId,String id) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi productApi = retrofit.create(ProductApi.class);

        Call<Void> promp = productApi.deleteProduct(merchantId,id);
        Response<Void> response = promp.execute();
        if (response.code() == 204) System.out.println("loh cok");
        if(response.code() == 400) throw new Exception("gagal menghapus");
    }

    @Override
    public void edit(String merchantId,String id, Map<String, Object> changes) throws Exception {
        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductApi productApi =  retrofit.create(ProductApi.class);
        Call<EditProductResp> promp = productApi.editProduct(merchantId,id,changes);
        Response<EditProductResp> response = promp.execute();
        if (response.code() == 400) throw new Exception("Gagal menghapus");
    }

    @Override
    public void updateStock(String merchantId,String id, int stock) throws Exception {
        if (stock < 0) throw new Exception("tidak boleh negatif");
        Map<String,Object> updateStock = new HashMap<>();
        updateStock.put("stock",stock);
        edit(merchantId,id,updateStock);
    }
}
