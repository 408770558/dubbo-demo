package com.dubbo.controller;

import com.dubbo.entity.UserBean;
import com.dubbo.service.TestConsumeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/8/27
 * 说明：
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @Resource
    TestConsumeService testServiceConsumer;

    @GetMapping("/getAll")
    public UserBean getAll(){
        return testServiceConsumer.getUser();
    }
}
