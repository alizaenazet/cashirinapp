package com.alpcashierin.cashierin.service;

import com.alpcashierin.cashierin.entity.Merchant;
import com.alpcashierin.cashierin.repository.MerchantRepository;
import com.alpcashierin.cashierin.repository.ProductRepository;
import com.alpcashierin.cashierin.utilities.ServiceLocator;

import java.util.List;
import java.util.Map;

public class MerchantServiceImpl implements MerchantService{
    MerchantRepository merchantRepository = ServiceLocator.getInstance().getService(MerchantRepository.class);
    @Override
    public boolean loginMerchant(String username, String password) {
        if(merchantRepository.loginMerchant(username, password)){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void registerMerchant(String username, String password, String name) throws Exception {
        if ((username==null||username.isBlank())||(password==null||password.isBlank())||(name==null||name.isBlank())){
            throw new Exception("Tidak boleh ada yang kosong");
        }else {
            Merchant merchant = new Merchant(username, password, name);
            merchantRepository.add(merchant);
        }
    }

    @Override
    public Merchant getMerchantProfile(String id) {
        return merchantRepository.get(id);
    }

    @Override
    public List<Merchant> getAllMerchant() {
        return merchantRepository.getAll();
    }

    @Override
    public void updateMerchantProfile(String id, Map<String,Object> data) {
        merchantRepository.edit(id, data);
    }
}
