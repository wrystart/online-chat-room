package com.wolupapa.chat.pojo;

import lombok.Data;

/**
 * @Description 接收登录请求的数据
 * @Author Ruiyang Wang
 * @Version 1.0
 * @Date 2023/11/9 20:58
 */
@Data
public class User {

    private String userId;
    private String username;
    private String password;
}
