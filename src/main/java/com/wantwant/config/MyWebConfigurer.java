package com.wantwant.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: Sqlserver_springboot
 * @description: 自定义资源映射
 * @author: Sunhaoyue
 * @create: 2019/07/02 13:48
 */

@Configuration
public class MyWebConfigurer  implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }

}
