package com.zhj.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.xkcoding.sharding.jdbc.mapper")
public class SpringBootHJDemoShardingJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHJDemoShardingJdbcApplication.class,args);
    }
}
