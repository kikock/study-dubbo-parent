package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.DubboApiService;
import org.springframework.stereotype.Component;


@Component
@Service
public class dubboApiServiceImpl implements DubboApiService {

    @Override
    public String sayHello() {
        return "hello-----dubbo---你好";
    }


}
