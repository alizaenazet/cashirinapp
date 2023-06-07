package com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DateTransaction {
    @SerializedName("date")
    String date;
    @SerializedName("transactions")
    List<TransactionDate> transactionDates;

    public String getDate() {
        return date;
    }

    public List<TransactionDate> getTransactionDates() {
        return transactionDates;
    }
}
