package com.alpcashierin.cashierin.entity;

import java.util.UUID;

public class Merchant {
    String id;
    String name;
    String username;
    String password;
    String address;
    String logourl;
    String bannerurl;
    String phone;


    public Merchant(String name, String username, String password, String address, String logourl) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.logourl = logourl;
        this.bannerurl = bannerurl;
        this.phone = phone;
    }

    public Merchant(String name, String username, String password) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getBannerurl() {
        return bannerurl;
    }

    public void setBannerurl(String bannerurl) {
        this.bannerurl = bannerurl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
