package com.example.androidexam.models;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String pwd;
    private String fullName;
    private String phoneNumber;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String email, String pwd, String fullName, String phoneNumber) {
        this.email = email;
        this.pwd = pwd;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
