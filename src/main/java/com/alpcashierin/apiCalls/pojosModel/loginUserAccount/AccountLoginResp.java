package com.alpcashierin.apiCalls.pojosModel.loginUserAccount;

import com.google.gson.annotations.SerializedName;

public class AccountLoginResp {

    @SerializedName("id")
    String id;

    @SerializedName("username")
    String username;

    @SerializedName("first_name")
    String firstname;

    @SerializedName("last_name")
    String lastname;

    @SerializedName("password")
    String password;

    @SerializedName("birthdate")
    String birthdate;

    @SerializedName("phone")
    String phone;

    @SerializedName("gender_type")
    String gender;

    @SerializedName("role_name")
    String role;

    @SerializedName("merchant_username")
    String merchantname;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }

    public String getMerchantname() {
        return merchantname;
    }

    @Override
    public String toString() {
        return "AccountResp{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", birtdate=" + birthdate +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                ", merchantname='" + merchantname + '\'' +
                '}';
    }
}
