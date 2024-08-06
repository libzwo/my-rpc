package com.zyj.example.provider;

import com.zyj.example.common.model.User;
import com.zyj.example.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user){
        System.out.println("用户名:" + user.getName());
        return user;
    }
}
