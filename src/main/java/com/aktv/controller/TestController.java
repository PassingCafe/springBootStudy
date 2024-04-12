package com.aktv.controller;

import com.aktv.dao.User;
import com.aktv.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
@Api(value = "swagger接口文档")
public class TestController {
    @RequestMapping("/get/{id}")
    public JsonResult<User> getUserInfo(@PathVariable @ApiParam(value = "用户唯一标识") Long id) {
        User user = new User(id, "测试", "123456");
        return new JsonResult(user);
    }

}
