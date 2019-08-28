package com.dubbo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/8/27
 * 说明：
 */
@Setter
@Getter
public class UserBean implements Serializable {

    /**
     * @字段名：serialVersionUID
     * @字段描述：{todo}
     */
    private static final long serialVersionUID = 5438739092677089251L;

    private Long id;
    private String name;
    private String password;
}
