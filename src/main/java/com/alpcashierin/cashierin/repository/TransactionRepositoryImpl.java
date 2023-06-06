package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Transaction;

import java.time.LocalDate;
import java.util.List;

public class TransactionRepositoryImpl implements TransactionRepository{
    @Override
    public Transaction get(String merchantId, LocalDate date) {
        return null;
    }

    @Override
    public List<Transaction> getAll(String merchantId) {
        return null;
    }
}
