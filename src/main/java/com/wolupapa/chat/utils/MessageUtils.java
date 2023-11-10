package com.wolupapa.chat.utils;

import com.alibaba.fastjson.JSON;
import com.wolupapa.chat.ws.pojo.ResultMessage;

/**
 * @Description 封装json格式消息的工具类
 * @Author Ruiyang Wang
 * @Version 1.0
 * @Date 2023/11/9 20:58
 */
public class MessageUtils {

    public static String getMessage(boolean isSystemMessage,String fromName, Object message) {

        ResultMessage result = new ResultMessage();
        result.setSystem(isSystemMessage);
        result.setMessage(message);
        if(fromName != null) {
            result.setFromName(fromName);
        }
        return JSON.toJSONString(result);
    }
}
