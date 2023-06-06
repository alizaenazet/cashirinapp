package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface TransactionService {
    Transaction getTransaction(String merchantId, LocalDate date);
    List<Transaction> getAllTransaction(String merchantId);
}
