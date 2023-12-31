package com.easypay.module.pay.util;

import com.easypay.module.pay.model.Product;
import com.yungouos.pay.alipay.AliPay;
import com.yungouos.pay.wxpay.WxPay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PayUtils
 * @Description: 支付工具类
 * @Author: lww
 * @Date: 6/29/23 8:42 AM
 * @Version: V1
 **/
@Component
@Configuration
@EnableConfigurationProperties({AliPayProperties.class,WxPayProperties.class})
public class PayUtils {

    private final static Logger LOGGER = LoggerFactory.getLogger(PayUtils.class);

    private AliPayProperties aliPay;

    private WxPayProperties wxPay;

    public PayUtils(AliPayProperties aliPay,WxPayProperties wxPay) {
        this.wxPay = wxPay;
        this.aliPay = aliPay;
    }

    /**
     * 微信支付
     * @param product
     * @return
     */
    public String wxPay(Product product){
        LOGGER.info("爪洼笔记公众号微信支付");
        String result = WxPay.nativePay(product.getOutTradeNo(),
                product.getTotalFee(), wxPay.getMchId(),
                product.getBody(), null, product.getAttach(),
                wxPay.getNotifyUrl(), null,null,
                null,null,wxPay.getKey());
        return result;
    }

    /**
     * 微信公众号支付
     * @param product
     * @return
     */
    public String jsApiPay(Product product){
        LOGGER.info("爪洼笔记公众号微信支付");
        String result = WxPay.jsapiPay(product.getOutTradeNo(),
                product.getTotalFee(), wxPay.getMchId(),
                product.getBody(), product.getOpenId(), product.getAttach(),
                wxPay.getNotifyUrl(), null,null,
                null,null,wxPay.getKey());
        return result;
    }

    /**
     * 支付宝支付
     * @param product
     * @return
     */
    public String aliPay(Product product){
        LOGGER.info("爪洼笔记公众号支付宝支付");
        String result = AliPay.nativePay(product.getOutTradeNo(),
                product.getTotalFee(), aliPay.getMchId(),
                product.getBody(), null, product.getAttach(),
                aliPay.getNotifyUrl(),aliPay.getKey());
        return result;
    }

    public AliPayProperties getAliPayProperties(){
        return aliPay;
    }

    public WxPayProperties getWxPayProperties(){
        return wxPay;
    }

}