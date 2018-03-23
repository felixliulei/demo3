package com.example.demo.service;

import com.example.demo.mapper.UserManagerMapper;
import com.example.demo.model.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerService {
    @Autowired
    private UserManagerMapper userManagerMapper;
    public UserManager checLogin(UserManager userManager){
        return userManagerMapper.checLogin(userManager);
    }
}
