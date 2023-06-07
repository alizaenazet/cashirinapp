package com.alpcashierin.cashierin.repository;

import com.alpcashierin.apiCalls.pojosModel.editAdminAccount.EditAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.editUserAccount.EditUserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.getAdminAccount.GetAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.getUserAccount.GetUserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.getUserAccount.UserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.loginAdminAccount.LoginAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.loginOwnerAccount.LoginOwnerAccountResp;
import com.alpcashierin.apiCalls.pojosModel.loginUserAccount.LoginUserAccountResp;
import com.alpcashierin.apiCalls.pojosModel.registerAdminAccount.RegisterAdminAccountResp;
import com.alpcashierin.apiCalls.pojosModel.registerOwnerAccount.RegisterOwnerAccount;
import com.alpcashierin.apiCalls.pojosModel.registerUserAccount.RegisterUserAccountResp;
import com.alpcashierin.apiCalls.retrofitInterface.AccountApi;
import com.alpcashierin.cashierin.entity.Account;
import com.alpcashierin.cashierin.utilities.RetrofitConfig;
import retrofit2.Call;
import retrofit2.Response;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository{
    String baseUrl = "http://108.136.45.44:3050/";
    @Override
    public String loginUser(String usernameMerchant, String username, String password) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Map<String, Object> accountTemp = new HashMap<>();
        accountTemp.put("username", username);
        accountTemp.put("password", password);

        Call<LoginUserAccountResp> promp = accountApi.loginUser(usernameMerchant, accountTemp);
        Response<LoginUserAccountResp> response = promp.execute();



        if (response.code() == 401) throw new Exception("Rejected");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(response.body().getDataUser().getBirthdate(), formatter);
        return (String) response.body().getDataUser().toString();
    }

    @Override
    public String addUser(String usernameMerchant, Account user) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Map<String, Object> accountTemp = new HashMap<>();
        accountTemp.put("username", user.getUsername());
        accountTemp.put("password", user.getPassword());
        accountTemp.put("firstname", user.getFirstname());
        accountTemp.put("lastname", user.getLastname());
        accountTemp.put("date_of_birth", String.valueOf(user.getBirthdate()));
        accountTemp.put("gender", user.getGender());
        accountTemp.put("phone", user.getPhone());

        Call<RegisterUserAccountResp> promp = accountApi.registerUser(usernameMerchant, accountTemp);
        Response<RegisterUserAccountResp> response = promp.execute();

        if (response.code() == 400) throw new Exception("fail");

        return response.body().getDataUser().getId();
    }

    @Override
    public Account getUser(String usernameMerchant, String id) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create((AccountApi.class));

        Call<GetUserAccountResp> promp = accountApi.getUser(usernameMerchant, id);
        Response<GetUserAccountResp> response = promp.execute();
        if (response.code() == 400) throw new Exception("User tidak ditemukan");
        System.out.println(response.code());
        UserAccountResp userAccountResp = response.body().getDataUser();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(userAccountResp.getBirthdate(), formatter);

        Account account = new Account(userAccountResp.getUsername(),userAccountResp.getPassword(),userAccountResp.getFirstname(),userAccountResp.getLastname(),
                                        date, userAccountResp.getPhone(),userAccountResp.getRole(),
                                        userAccountResp.getGender());
        return account;
    }

    @Override
    public void deleteUser(String usernameMerchant, String id) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Call<Void> promp = accountApi.deleteUser(usernameMerchant, id);
        Response<Void> response = promp.execute();

        if(response.code() == 400) throw new Exception("Fail to Delete");
    }

    @Override
    public void editUser(String usernameMerchant, String id, Map<String, Object> changes) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Call<EditUserAccountResp> promp = accountApi.editUser(usernameMerchant, id, changes);
        Response<EditUserAccountResp> response = promp.execute();

        if (response.code() == 400) throw new Exception("fail");

    }

    //Admin
    @Override
    public String loginAdmin(String usernameMerchant, String username, String password) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Map<String, Object> accountTemp = new HashMap<>();
        accountTemp.put("username", username);
        accountTemp.put("password", password);

        Call<LoginAdminAccountResp> promp = accountApi.loginAdmin(usernameMerchant, accountTemp);
        Response<LoginAdminAccountResp> response = promp.execute();



        if (response.code() == 401) throw new Exception("Rejected");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(response.body().getDataUser().getBirthdate(), formatter);
        return (String) response.body().getDataUser().toString();
    }

    @Override
    public String addAdmin(String usernameMerchant, Account admin) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        System.out.println(admin.getFirstname());
        Map<String, Object> accountTemp = new HashMap<>();
        accountTemp.put("username", admin.getUsername());
        accountTemp.put("password", admin.getPassword());
        accountTemp.put("firstname", admin.getFirstname());
        accountTemp.put("lastname", admin.getLastname());
        accountTemp.put("date_of_birth", String.valueOf(admin.getBirthdate()));
        accountTemp.put("gender", admin.getGender());
        accountTemp.put("phone", admin.getPhone());

        Call<RegisterAdminAccountResp> promp = accountApi.registerAdmin(usernameMerchant, accountTemp);
        Response<RegisterAdminAccountResp> response = promp.execute();

        if (response.code() == 400) throw new Exception("fail");
        System.out.println(response.code());

        System.out.println(response.body().toString());
        return response.body().getDataAdmin().getId();
    }

    @Override
    public Account getAdmin(String usernameMerchant, String id) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create((AccountApi.class));

        Call<GetAdminAccountResp> promp = accountApi.getAdmin(usernameMerchant, id);
        Response<GetAdminAccountResp> response = promp.execute();
        if (response.code() == 400) throw new Exception("User tidak ditemukan");
        System.out.println(response.code());
        UserAccountResp adminAccountResp = response.body().getDataAdmin();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(adminAccountResp.getBirthdate(), formatter);

        Account account = new Account(adminAccountResp.getUsername(),adminAccountResp.getPassword(),adminAccountResp.getFirstname(),adminAccountResp.getLastname(),
                date, adminAccountResp.getPhone(),adminAccountResp.getRole(),
                adminAccountResp.getGender());
        return account;
    }

    @Override
    public void deleteAdmin(String usernameMerchant, String id) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Call<Void> promp = accountApi.deleteUser(usernameMerchant, id);
        Response<Void> response = promp.execute();

        if(response.code() == 400) throw new Exception("Fail to Delete");
    }

    @Override
    public void editAdmin(String usernameMerchant, String id, Map<String, Object> changes) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Call<EditAdminAccountResp> promp = accountApi.editAdmin(usernameMerchant, id, changes);
        Response<EditAdminAccountResp> response = promp.execute();

        if (response.code() == 400) throw new Exception("fail");
    }

    //Owner
    @Override
    public String loginOwner(String usernameMerchant, String username, String password) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        Map<String, Object> accountTemp = new HashMap<>();
        accountTemp.put("username", username);
        accountTemp.put("password", password);

        Call<LoginOwnerAccountResp> promp = accountApi.loginOwner(usernameMerchant, accountTemp);
        Response<LoginOwnerAccountResp> response = promp.execute();



        if (response.code() == 401) throw new Exception("Rejected");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(response.body().getDataOwner().getAccount().getBirthdate(), formatter);
        return (String) response.body().getDataOwner().toString();
    }

    @Override
    public String addOwner(String usernameMerchant, Account owner) throws Exception {
        AccountApi accountApi = RetrofitConfig.config(baseUrl).create(AccountApi.class);

        System.out.println(owner.getFirstname());
        Map<String, Object> accountTemp = new HashMap<>();
        accountTemp.put("username", owner.getUsername());
        accountTemp.put("password", owner.getPassword());
        accountTemp.put("firstname", owner.getFirstname());
        accountTemp.put("lastname", owner.getLastname());
        accountTemp.put("date_of_birth", String.valueOf(owner.getBirthdate()));
        accountTemp.put("gender", owner.getGender().toString().toLowerCase());
        accountTemp.put("phone", owner.getPhone());

        System.out.println(String.valueOf(owner.getBirthdate()));

            Call<RegisterOwnerAccount> promp = accountApi.registerOwner(usernameMerchant, accountTemp);
        Response<RegisterOwnerAccount> response = promp.execute();

        if (response.code() == 400) throw new Exception("fail");
        System.out.println(response.code());

        System.out.println(response.body());
        return response.body().getDataOwner().getId();
    }

    @Override
    public Account getOwner(String usernameMerchant, String id) throws Exception {
        return null;
    }

    @Override
    public void editOwner(String usernameMerchant, String id, Map<String, Object> changes) throws Exception {

    }
}
