package com.easypay.module.pay.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: WxPayProperties
 * @Description: 微信支付工具类
 * @Author: lww
 * @Date: 6/29/23 8:42 AM
 * @Version: V1
 **/
@Data
@ConfigurationProperties(prefix = "wx.pay")
public class WxPayProperties {

    private String mchId;
    private String key;
    private String notifyUrl;

}