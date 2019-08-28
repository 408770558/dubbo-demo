package com.dubbo.impl;


import com.dubbo.entity.UserBean;
import com.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/8/27
 * 说明：
 */
@Service(interfaceClass = TestService.class, timeout = 5000)
@Component
public class TestServiceImpl implements TestService {
    @Override
    public UserBean getUser() {
        UserBean user = new UserBean();
        user.setId(1L);
        user.setName("张三");
        user.setPassword("123456789");
        return user;
    }
}
