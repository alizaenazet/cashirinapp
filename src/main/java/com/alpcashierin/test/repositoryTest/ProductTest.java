package repositoryTest;

import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.GetProductResp;
import com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct.ProductResp;
import com.alpcashierin.apiCalls.retrofitInterface.ProductApi;
import com.alpcashierin.cashierin.entity.Product;
import com.alpcashierin.cashierin.repository.CategoryRepository;
import com.alpcashierin.cashierin.repository.CategoryRepositoryImpl;
import com.alpcashierin.cashierin.repository.ProductRepository;
import com.alpcashierin.cashierin.repository.ProductRepositoryImpl;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductTest {



    public static void main(String[] args) throws Exception {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        System.out.println(categoryRepository.add("-Lv6cFB16m6V1Aj91uEcn","gorengan"));
        System.out.println("cok");

    }

}
