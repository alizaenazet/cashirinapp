package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Merchant;

import java.util.List;
import java.util.Map;

public interface MerchantRepository {

    Merchant get(String id);
    List<Merchant> getAll();
    void add(Merchant merchant);
    void edit(String id, Map<String,Object> data);
    boolean loginMerchant(String username, String password);

}
