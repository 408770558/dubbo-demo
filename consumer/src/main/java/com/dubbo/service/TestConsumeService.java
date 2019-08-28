package com.dubbo.service;

import com.dubbo.entity.UserBean;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/8/27
 * 说明：
 */
@Component
public class TestConsumeService {

    @Reference
    private TestService testService;

    public UserBean getUser(){
        return testService.getUser();
    }
}
