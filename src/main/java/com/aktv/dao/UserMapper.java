package com.aktv.dao;

import com.aktv.entity.User;
import com.aktv.utils.JsonResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    User getUserByName(String username);
    @Select("select * from user where id=#{id}")
    User getUserById(Long id);
    @Insert("insert into user (username,password) values (#{username},#{password})")
    void insertUser(User user);
}
