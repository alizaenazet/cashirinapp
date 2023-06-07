package com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction;

import com.google.gson.annotations.SerializedName;

public class GetTransaction {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    DateTransaction dateTransaction;

    public String getStatus() {
        return status;
    }

    public DateTransaction getDateTransaction() {
        return dateTransaction;
    }
}
