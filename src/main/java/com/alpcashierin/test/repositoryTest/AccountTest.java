package com.alpcashierin.test.repositoryTest;

import com.alpcashierin.cashierin.entity.Account;
import com.alpcashierin.cashierin.entity.Gender;
import com.alpcashierin.cashierin.entity.Role;
import com.alpcashierin.cashierin.repository.AccountRepository;
import com.alpcashierin.cashierin.repository.AccountRepositoryImpl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AccountTest {

    public static void main(String[] args) throws Exception {
        AccountRepository accountRepository = new AccountRepositoryImpl();
        System.out.println(Gender.MALE.toString().toLowerCase());
        Account account = new Account("bintangs","bintang1233","Dewa","Jago",LocalDate.now(),"+621432526346",Role.OWNER,Gender.MALE);
        accountRepository.addOwner("Lv6cFB16m6V1Aj91uEcn",account);
    }
}
