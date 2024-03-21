package com.aktv.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequiredArgsConstructor
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
}