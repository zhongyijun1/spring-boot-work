package com.zhj.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.zhj.quartz.mapper"})
@SpringBootApplication
public class SpringBootHJDemoTaskQuartzApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHJDemoTaskQuartzApplication.class,args);
    }
}
