package com.aktv.controller;


import com.aktv.entity.User;
import com.aktv.service.UserService;
import com.aktv.utils.JsonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class SqlController {
    @Resource
    private UserService userService;

    @RequestMapping("/getUserByName/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @PostMapping("/adduser")
    public JsonResult addUser(@RequestBody User user) throws Exception {
        if (null != user) {
            userService.insertUser(user);
            return new JsonResult();
        } else {
            return new JsonResult("400","添加失败");
        }
    }
}
