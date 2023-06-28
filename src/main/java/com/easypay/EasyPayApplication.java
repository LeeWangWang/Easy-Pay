package com.easypay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 * 演示地址：https://pay.cloudbed.vip 申请地址：https://mmbizurl.cn/s/hEludsCNs 启动前请务必看 README.md 中的安装教程
 **/
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class EasyPayApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(EasyPayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EasyPayApplication.class, args);
        logger.info("一个超级好用的个人支付平台");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EasyPayApplication.class);
    }
}
