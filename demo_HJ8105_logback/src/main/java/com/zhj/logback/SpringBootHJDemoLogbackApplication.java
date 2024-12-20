package com.zhj.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringBootHJDemoLogbackApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootHJDemoLogbackApplication.class, args);
        int length = context.getBeanDefinitionNames().length;
        log.trace("Spring boot启动初始化了1 {} 个 Bean", length);
        log.debug("Spring boot启动初始化了2 {} 个 Bean", length);
        log.info("Spring boot启动初始化了3 {} 个 Bean", length);
        log.warn("Spring boot启动初始化了4 {} 个 Bean", length);
        log.error("Spring boot启动初始化了5 {} 个 Bean", length);
        try {
            int i = 0;
            int j = 1 / i;
        } catch (Exception e) {
            log.error("【SpringBootDemoLogbackApplication】启动异常：", e);
        }
    }
}
