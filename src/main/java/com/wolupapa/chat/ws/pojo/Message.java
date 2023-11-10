package com.wolupapa.chat.ws.pojo;

import lombok.Data;

/**
 * @Description  用于封装浏览器发送给服务端的消息数据
 * @Author Ruiyang Wang
 * @Version 1.0
 * @Date 2023/11/9 20:59
 */
@Data
public class Message {
    private String toName;
    private String message;
}
