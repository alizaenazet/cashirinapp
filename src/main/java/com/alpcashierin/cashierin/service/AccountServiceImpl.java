package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Account;
import com.alpcashierin.cashierin.entity.Gender;
import com.alpcashierin.cashierin.repository.AccountRepository;
import com.alpcashierin.cashierin.repository.AccountRepositoryImpl;

import java.time.LocalDate;
import java.util.List;

public class AccountServiceImpl implements AccountService{
    AccountRepository accountRepository = new AccountRepositoryImpl();
    @Override
    public boolean loginUser(String username, String password) {
        return false;
    }

    @Override
    public void registerUser(String username, String password, String firstname, String lastname, LocalDate birthdate, Gender gender, String role) {

    }

    @Override
    public void updateProfile(String id) {

    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    @Override
    public List<Account> getAllUser() {
        return null;
    }
}
