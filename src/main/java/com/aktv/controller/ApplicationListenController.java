package com.aktv.controller;

import com.aktv.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/application")
public class ApplicationListenController {
    @GetMapping("/user")
    public User getUser(HttpServletRequest request) {
        ServletContext application=request.getServletContext();
        return  (User)application.getAttribute("user");
    }
}
