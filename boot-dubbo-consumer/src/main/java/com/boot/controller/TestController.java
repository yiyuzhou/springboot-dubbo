package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.entity.User;
import com.boot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by yyz
 * on 2018/6/5
 */

@RestController
@RequestMapping("/")
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public User user() {
        return testService.findUser();
    }

}
