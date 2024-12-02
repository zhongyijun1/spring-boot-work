package com.zhj.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.zhj.mapper.mapper"})
public class SpringBootDemoHJOrmMybatisMapperPageApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoHJOrmMybatisMapperPageApplication.class,args);
    }
}
