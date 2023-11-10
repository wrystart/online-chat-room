package com.wolupapa.chat.ws.pojo;

import lombok.Data;

/**
 * @Description 用来封装服务端给浏览器发送的消息数据
 * @Author Ruiyang Wang
 * @Version 1.0
 * @Date 2023/11/9 20:59
 */
@Data
public class ResultMessage {

    private boolean isSystem;
    private String fromName;
    private Object message;//如果是系统消息是数组
}
