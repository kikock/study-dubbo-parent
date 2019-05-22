package com.dubbo.client.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.DubboApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @Reference
    private DubboApiService dubboApiService;

    @RequestMapping("123")
    public String dubboController() {
        return dubboApiService.sayHello();
    }
}
