package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Merchant;

import java.util.List;
import java.util.Map;

public interface MerchantService {
    String loginMerchant(String username, String password);
    void registerMerchant(String username, String password, String name) throws Exception;
    Merchant getMerchantProfile(String id) throws Exception;
    List<Merchant> getAllMerchant();
    void updateMerchantProfile(String id, Map<String,Object> data) throws Exception;

}
