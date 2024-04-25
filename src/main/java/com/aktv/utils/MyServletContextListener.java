package com.aktv.utils;

import com.aktv.entity.User;
import com.aktv.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import javax.servlet.ServletContext;

@Component
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser(1l);
        ServletContext application=applicationContext.getBean(ServletContext.class);
        application.setAttribute("user",user);
    }
}
