package com.example.androidexam.business;

import com.example.androidexam.dao.UserDao;
import com.example.androidexam.models.User;

public class DefaultServices implements Services{
    private UserDao userDao;
    public DefaultServices(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public User login(String login, String password) {
        User user=userDao.get(login);
        if(user==null)
            return null;

        if(user.getPwd().equals(password))
            return user;

        return null;
    }
}
