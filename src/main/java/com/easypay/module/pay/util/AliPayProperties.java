package com.easypay.module.pay.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: AliPayProperties
 * @Description: 阿里支付工具包
 * @Author: lww
 * @Date: 6/29/23 8:41 AM
 * @Version: V1
 **/
@Data
@ConfigurationProperties(prefix = "ali.pay")
public class AliPayProperties {

    private String mchId;
    private String key;
    private String notifyUrl;

}