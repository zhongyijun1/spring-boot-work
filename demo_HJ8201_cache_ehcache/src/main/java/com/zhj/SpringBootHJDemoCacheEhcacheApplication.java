package com.zhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootHJDemoCacheEhcacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHJDemoCacheEhcacheApplication.class,args);
    }
}
