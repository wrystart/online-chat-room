package com.wolupapa.chat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Description websocket配置类
 * @Author wrystart
 * @Version 1.0
 * @Date 2023/11/09 20:25
 */
@Configuration
public class WebSocketConfig {

    //注入ServerEndpointExporter，自动注册使用@ServerEndpoint注解的Bean
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
