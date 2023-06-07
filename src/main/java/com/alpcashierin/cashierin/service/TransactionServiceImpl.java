package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Transaction;
import com.alpcashierin.cashierin.repository.TransactionRepository;
import com.alpcashierin.cashierin.repository.TransactionRepositoryImpl;
import com.alpcashierin.cashierin.utilities.ServiceLocator;

import java.time.LocalDate;
import java.util.List;

public class TransactionServiceImpl implements TransactionService{
    TransactionRepository transactionRepository;

    public TransactionServiceImpl() {
        this.transactionRepository = ServiceLocator.getInstance().getService(TransactionRepository.class);
    }

    @Override
    public Transaction getTransaction(String merchantId, LocalDate date) throws Exception {
        return transactionRepository.get(merchantId,date);
    }

    @Override
    public List<Transaction> getAllTransaction(String merchantId) {
        return transactionRepository.getAll(merchantId);
    }
}
