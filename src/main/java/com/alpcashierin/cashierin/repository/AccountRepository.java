package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Account;

import java.util.Map;

public interface AccountRepository {
    boolean loginUser(String username, String password);
    void addUser(Account user);
    void getUser(Account username);
    boolean deleteUser(String id);
    void editUser(String id, Map<String, Object> changes);

}
