package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository {
    Transaction get(String merchantId, LocalDate date);
    List<Transaction> getAll(String merchantId);
}
