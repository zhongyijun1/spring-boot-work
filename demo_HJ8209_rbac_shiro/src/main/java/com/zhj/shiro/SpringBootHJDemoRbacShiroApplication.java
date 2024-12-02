package com.zhj.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhj.shiro.mapper")
public class SpringBootHJDemoRbacShiroApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHJDemoRbacShiroApplication.class,args);
    }
}
