package com.example.demo.mapper;

import com.example.demo.model.UserManager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserManagerMapper {
    public UserManager checLogin(UserManager userManager);
}
