package com.aktv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("李白");
        mylist.add("王维");
        mylist.add("杜甫");
        model.addAttribute("mylist",mylist);
        return "success";
    }
    @RequestMapping("login")
    @ResponseBody
    public String getUser(){
        return "登录成功";
    }
}