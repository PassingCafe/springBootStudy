package com.aktv.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/thymeleaf")
@Slf4j
public class ThymeleafController {
    @RequestMapping("/test404")
    public String test404() {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500() {
        int i = 1 / 0;
        return "index";
    }

    @RequestMapping("/testlog")
    @ResponseBody
    public String testlog() {
        log.info("======测试日志info级别打印=====");
        return "success";
    }

}
