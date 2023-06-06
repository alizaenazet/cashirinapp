package com.alpcashierin.cashierin.repository;

import com.alpcashierin.cashierin.entity.Merchant;

import java.util.List;
import java.util.Map;

public class MerchantRepositoryImpl implements MerchantRepository{
    @Override
    public Merchant get(String id) {
        return null;
    }

    @Override
    public List<Merchant> getAll() {
        return null;
    }

    @Override
    public void add(Merchant merchant) {

    }

    @Override
    public void edit(String id, Map<String, Object> changes) {

    }

    @Override
    public boolean loginMerchant(String username, String password) {
        return false;
    }
}
