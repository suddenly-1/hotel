package com.yuantu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    private static String[] originsVal = new String[]{
            "localhost:8000",
            "127.0.0.1:8000",
            "127.0.0.1",
            "localhost",
            "172.19.144.143",
            "172.19.144.143:8000"
    };
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        for (String origin : originsVal){
            registry.addMapping("/**").allowedOrigins("http://" + origin);
            registry.addMapping("/**").allowedOrigins("https://" + origin);
        }
        registry.addMapping("/**")  //所有的接口
                .allowCredentials(true)     // 允许带cookie访问
                .allowedHeaders("*")        // 所有的请求头
                .allowedMethods("*")        // 所有的方法
                .maxAge(30*1000);           // 探测请求的有效期

    }
}
