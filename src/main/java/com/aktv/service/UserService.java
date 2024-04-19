package com.aktv.service;

import com.aktv.dao.UserMapper;
import com.aktv.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserService implements UserMapper {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserByName(String username) {
        User user= userMapper.getUserByName(username);
        return user;
    }
}
