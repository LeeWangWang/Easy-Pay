package com.easypay.module.pay.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: Product
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:34 PM
 * @Version: V1
 **/
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 订单号
     */
    private String outTradeNo;
    /**
     * 付款金额
     */
    private String totalFee;
    /**
     * 商户号
     */
    private String mchId;
    /**
     * 商品描述
     */
    private String body;
    /**
     * 类型
     * 1、返回微信原生的支付连接需要自行生成二维码；
     * 2、直接返回付款二维码地址，页面上展示即可。不填默认1
     */
    private String type;
    /**
     * 附加数据，回调时候原路返回
     */
    private String attach;
    /**
     * 异步回调地址，用户支付成功后系统将会把支付结果发送到该地址，不填则无回调
     */
    private String notifyUrl;
    /**
     * 同步地址（收银台模式才有效）。支付完毕后用户浏览器返回到该地址
     */
    private String returnUrl;
    /**
     * 分账配置单号。支持多个分账，使用,号分割
     */
    private String configNo;
    /**
     * 执行自动分账动作的节点，枚举值【pay、callback】分别表示【付款成功后分账、回调成功后分账】
     */
    private String auto;
    /**
     * 分账模式。【0：不分账 1：自动分账 2：手动分账】 默认 0
     */
    private String autoNode;
    private String key;

    /**
     * 创建用户
     */
    private Long userCreate;

    /**
     * 微信公众号支付
     */
    private String openId;

}
