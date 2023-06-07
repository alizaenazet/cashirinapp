package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder.GetAllOrders;
import com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder.GetOrderResp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OrderApi {
    @GET("/merchants/{username}/orders/{id}")
    Call<GetOrderResp> getOrder(@Path("username")String merchantUsername,@Path("id")String orderId);
    @GET("merchants/{username}/orders")
    Call<GetAllOrders> getAllOrders(@Path("username") String merchantUsername);

}
