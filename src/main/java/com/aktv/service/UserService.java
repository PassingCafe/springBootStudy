package com.aktv.service;

import com.aktv.dao.UserMapper;
import com.aktv.entity.User;
import com.aktv.utils.JsonResult;
import org.springframework.transaction.annotation.Transactional;
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

    @Override
    public User getUserById(Long id) {
        User user=userMapper.getUserById(id);
        return user;
    }

    @Override
    @Transactional
    public void insertUser(User user) {
        userMapper.insertUser(user);
        //throw new RuntimeException();

    }
}
