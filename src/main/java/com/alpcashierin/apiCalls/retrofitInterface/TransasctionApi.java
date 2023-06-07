package com.alpcashierin.apiCalls.retrofitInterface;

import com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction.GetTransaction;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TransasctionApi {
    @GET("merchants/{id}/transaction/{date}")
    Call<GetTransaction> getTransaction(@Path("id") String id,@Path("date") String date);
}
