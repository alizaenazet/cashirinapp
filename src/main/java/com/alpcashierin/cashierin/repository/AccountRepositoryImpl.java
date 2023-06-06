package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Account;

import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository{
    @Override
    public boolean loginUser(String username, String password) {
        return false;
    }

    @Override
    public void addUser(Account user) {

    }

    @Override
    public void getUser(Account username) {

    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    @Override
    public void editUser(String id, Map<String, Object> changes) {

    }
}
