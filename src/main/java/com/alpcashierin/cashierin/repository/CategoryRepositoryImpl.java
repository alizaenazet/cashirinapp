package com.alpcashierin.cashierin.repository;

import com.alpcashierin.apiCalls.pojosModel.categoryResponse.createCategory.CreateCategoryResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.CategoryNameResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.GetCagoriesResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.GetCategoryResp;
import com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory.ProductCategoryResp;
import com.alpcashierin.apiCalls.retrofitInterface.CategoryApi;
import com.alpcashierin.cashierin.entity.Category;
import com.alpcashierin.cashierin.entity.Product;
import com.alpcashierin.cashierin.utilities.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryRepositoryImpl implements  CategoryRepository {
    String baseUrl = "http://108.136.45.44:3050/";

    @Override
    public Category get(String merchantId, String categoryId) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CategoryApi categoryApi = retrofit.create(CategoryApi.class);

        Call<GetCategoryResp> promp = categoryApi.getCategory(merchantId,categoryId);
        Response<GetCategoryResp> response = promp.execute();
        if (response.code() == 400) throw new Exception("Gagal mengambil");
        CategoryNameResp categoryNameResp = response.body().getCategory();
        List<Product> products = new ArrayList<>();
        List<ProductCategoryResp> productsCategory = categoryNameResp.getProducts();
        for (int i = 0; i < productsCategory.size() ;i++) {
            Product product = new Product(
                    productsCategory.get(i).getId(),productsCategory.get(i).getName(),productsCategory.get(i).getDescription(),
                    productsCategory.get(i).getStock(),((int)Double.parseDouble(productsCategory.get(i).getPrice())));
            products.add(product);
        }
        Category category = new Category(categoryNameResp.getName(),products);
        return category;
    }


    @Override
    public List<Category> getAll(String merchantId) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
                CategoryApi categoryApi = retrofit.create(CategoryApi.class);
                Call<GetCagoriesResp> promp = categoryApi.getAllCategories(merchantId);
                Response<GetCagoriesResp> response = promp.execute();
                if (response.code() == 400) throw new Exception("merchant tidak ada");
                List<Category> categories = new ArrayList<>();
                List<CategoryNameResp> respCategories= response.body().getCagories();;
                for (int i = 0; i < respCategories.size(); i++) {
                List<Product> products = new ArrayList<>();
                List<ProductCategoryResp> productsCategory = respCategories.get(i).getProducts();
                for (int j = 0; j < productsCategory.size() ;j++) {
                    Product product = new Product(productsCategory.get(j).getId(),productsCategory.get(j).getName(),productsCategory.get(j).getDescription(),
                            productsCategory.get(j).getStock(),((int)Double.parseDouble(productsCategory.get(j).getPrice())));
                    products.add(product);
                }
            Category category = new Category(respCategories.get(i).getName(),products);
            categories.add(category);
        }
    return  categories;
    }

    @Override
    public String add(String merchantId, String name) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CategoryApi categoryApi = RetrofitConfig.config(baseUrl).create(CategoryApi.class);
        Map<String,Object> categoryTemp = new HashMap<>();
        categoryTemp.put("name",name);
        Call<CreateCategoryResp> promp = categoryApi.createCategory(merchantId,categoryTemp);
        Response<CreateCategoryResp> response = promp.execute();
        if (response.code() == 400) throw new Exception("Merchant tidak ditemukan");
        return (String) response.body().getData().get("id");
    }

    @Override
    public void delete(String merchantId, String categoryId) {
        CategoryApi categoryApi = RetrofitConfig.config(baseUrl).create(CategoryApi.class);

    }

    @Override
    public void edit(String merchantId, String categoryId, String name) {

    }

    @Override
    public void addProduct(String merchantId, String categoryId, Product product) {

    }


}
