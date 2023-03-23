package com.example.androidexam.business;

import com.example.androidexam.models.User;


public interface Services {
    User login(String login, String password);
}
