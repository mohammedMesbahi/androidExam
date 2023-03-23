package com.example.androidexam;

import android.app.Application;

import com.example.androidexam.business.DefaultServices;
import com.example.androidexam.business.Services;
import com.example.androidexam.dao.UserDaoMemory;

public class MyContext extends Application {

    private Services services;
    @Override
    public void onCreate() {
        super.onCreate();
        services=new DefaultServices(new UserDaoMemory());
    }

    public Services getServices() {
        return services;
    }
}
