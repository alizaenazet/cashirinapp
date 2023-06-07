package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Merchant;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface MerchantRepository {

    Merchant get(String username) throws Exception;
    String add(Merchant merchant) throws Exception;
    void edit(String username, Map<String,Object> data) throws Exception;
    String loginMerchant(String username, String password) throws Exception;

}
