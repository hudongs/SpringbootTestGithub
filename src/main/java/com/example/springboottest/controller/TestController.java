package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hudong
 * @Date 2026/8/11 23:58
 **/
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        log.info("你说hello，我说hello:{}","小宝");
        return "hello world";
    }
}
