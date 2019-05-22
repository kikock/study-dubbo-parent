package com.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ImportResource({ "classpath:dubbo/*.xml" })
//@PropertySource("classpath:swagger-dubbo.properties")
@DubboComponentScan(basePackages = {"com.dubbo"})
@EnableDubboSwagger
public class DubboConfig {
}
