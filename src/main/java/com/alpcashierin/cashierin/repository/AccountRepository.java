package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Account;

import java.io.IOException;
import java.util.Map;

public interface AccountRepository {
    //User
    String loginUser(String usernameMerchant, String username, String password) throws Exception;
    String addUser(String usernameMerchant, Account user) throws Exception;
    Account getUser(String usernameMerchant, String id) throws Exception;
    void deleteUser(String usernameMerchant, String id) throws Exception;
    void editUser(String usernameMerchant, String id, Map<String, Object> changes) throws Exception;

    //Admin
    String loginAdmin(String usernameMerchant, String username, String password) throws Exception;
    String addAdmin(String usernameMerchant, Account admin) throws Exception;
    Account getAdmin(String usernameMerchant, String id) throws Exception;
    void deleteAdmin(String usernameMerchant, String id) throws Exception;
    void editAdmin(String usernameMerchant, String id, Map<String, Object> changes) throws Exception;

    //Owner
    String loginOwner(String usernameMerchant,String username, String password) throws Exception;
    String addOwner(String usernameMerchant, Account owner) throws Exception;
    Account getOwner(String usernameMerchant, String id) throws Exception;
    void editOwner(String usernameMerchant, String id, Map<String, Object> changes) throws Exception;

}
