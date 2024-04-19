package com.aktv.dao;

import com.aktv.entity.User;

public interface UserMapper {
    User getUserByName(String username);
}
