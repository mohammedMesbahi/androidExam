package com.example.androidexam.dao;

import com.example.androidexam.models.User;

public interface UserDao {
     User get(String login);
}
