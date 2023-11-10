package com.wolupapa.chat.pojo;

import lombok.Data;

/**
 * @Description 用来封装http请求的响应数据
 * @Author Ruiyang Wang
 * @Version 1.0
 * @Date 2023/11/9 20:58
 */
@Data
public class Result {
    private boolean flag;
    private String message;
}
