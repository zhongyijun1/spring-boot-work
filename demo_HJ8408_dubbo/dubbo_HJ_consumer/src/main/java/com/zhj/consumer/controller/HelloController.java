package com.zhj.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xkcoding.dubbo.common.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(defaultValue = "zhj") String name) {
        log.info("i'm ready to call someone......");
        return helloService.sayHello(name);
    }
}
