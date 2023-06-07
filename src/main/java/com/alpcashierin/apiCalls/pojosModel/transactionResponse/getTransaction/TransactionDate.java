package com.alpcashierin.apiCalls.pojosModel.transactionResponse.getTransaction;

import com.google.gson.annotations.SerializedName;

public class TransactionDate {
    @SerializedName("id")
    String id;
    @SerializedName("customer_name")
    String customerName;
    @SerializedName("customer_table_number")
    String tableNumber;
    @SerializedName("time")
    String time;
    @SerializedName("total")
    int total;
    @SerializedName("merchant_id")
    String merchantId;
    @SerializedName("note")
    String  note;

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public String getTime() {
        return time;
    }

    public int getTotal() {
        return total;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getNote() {
        return note;
    }
}
