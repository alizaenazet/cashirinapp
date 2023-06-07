package com.alpcashierin.apiCalls.pojosModel.getUserAccount;

import com.alpcashierin.cashierin.entity.Gender;
import com.alpcashierin.cashierin.entity.Role;
import com.google.gson.annotations.SerializedName;

public class UserAccountResp {

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
    Gender gender;

    @SerializedName("role_name")
    Role role;

    @SerializedName("merchant_username")
    String usernameMerchant;



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

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public String getUsernameMerchant() {
        return usernameMerchant;
    }
    @Override
    public String toString() {
        return "UserAccountResp{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", birthdate=" + birthdate +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                ", usernameMerchant='" + usernameMerchant + '\'' +
                '}';
    }
}
