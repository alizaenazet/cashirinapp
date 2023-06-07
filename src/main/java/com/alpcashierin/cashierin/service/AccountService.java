package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Account;
import com.alpcashierin.cashierin.entity.Gender;

import java.time.LocalDate;
import java.util.List;


public interface AccountService {
    boolean loginUser(String merchantUsername,String username, String password);
    void registerUser(String merchantUsername,String username, String password ,String firstname, String lastname, LocalDate birthdate, Gender gender, String role);
    void updateProfile(String merchantUsername, String id);
    boolean deleteUser(String merchantUsername,String id);
    List<Account> getAllUser(String merchantUsername);

}
