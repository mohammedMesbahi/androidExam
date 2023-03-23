package com.example.androidexam.dao;

import com.example.androidexam.models.User;

import java.util.List;
import java.util.Vector;

public class UserDaoMemory implements UserDao{
    private List<User> users;

    public UserDaoMemory(){
        users=new Vector<>();
        users.add(new User("user1@gmail.com","1234","user1","0688139882"));
        users.add(new User("user2@gmail.com","1234","user2","0688139882"));
    }
    @Override
    public User get(String login) {
        for (User u :users)
            if(u.getEmail().equals(login))
                return u;
        return null;
    }
}
