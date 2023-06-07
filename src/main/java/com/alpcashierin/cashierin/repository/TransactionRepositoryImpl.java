package com.alpcashierin.cashierin.repository;

import com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction.DateTransaction;
import com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction.GetTransaction;
import com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction.TransactionDate;
import com.alpcashierin.apiCalls.retrofitInterface.TransasctionApi;
import com.alpcashierin.cashierin.entity.Transaction;
import com.alpcashierin.cashierin.utilities.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Response;

import java.time.LocalDate;
import java.util.List;

public class TransactionRepositoryImpl implements TransactionRepository{
    String baseUrl = "http://108.136.45.44:3050/";
    @Override
    public Transaction get(String merchantId, LocalDate date) throws Exception {
        TransasctionApi transasctionApi = RetrofitConfig.config(baseUrl).create(TransasctionApi.class);
        Call<GetTransaction> promp = transasctionApi.getTransaction(merchantId,String.valueOf(date));
        Response<GetTransaction> response = promp.execute();
        if (response.code() == 400) throw new Exception("tidak ada transaksi");

        DateTransaction dateTransaction = response.body().getDateTransaction();

//        Transaction transaction = new Transaction(dateTransaction.getDate(),)

        return null;
    }

    @Override
    public List<Transaction> getAll(String merchantId) {
        return null;
    }
}
