package com.alpcashierin.apiCalls.pojosModel.productResponse.registerUserAccount;

import com.google.gson.annotations.SerializedName;

public class AccountRegisterResp {

    @SerializedName("id")
    String id;

    @SerializedName("username")
    String username;

    @SerializedName("firstname")
    String firstname;

    @SerializedName("lastname")
    String lastname;

    @SerializedName("role")
    String role;

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

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "AccountRegisterResp{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
