package com.easypay.module.pay.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.easypay.common.config.BigDecimalSerialize;
import com.easypay.common.model.PageBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @ClassName: Order
 * @Description: app_order 订单
 * @Author: lww
 * @Date: 6/28/23 7:33 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "app_order")
@EqualsAndHashCode(callSuper=false)
public class Order extends PageBean implements Serializable{

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    private Long id;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 商品描述
     */
    @Column(name = "body")
    private String body;

    /**
     * 订单号
     */
    @Column(name = "order_no", length = 200)
    private String orderNo;

    /**
     * 付款金额
     */
    @JsonSerialize(using = BigDecimalSerialize.class)
    @Column(name = "total_Fee",scale = 2, precision = 18)
    private BigDecimal totalFee;

    /**
     * 订单支付状态 0： 未支付 1： 支付
     */
    @Column(name = "status", length = 4)
    private Short status;

    /**
     * 支付类型 0：微信  1：支付宝
     */
    @Column(name = "type", length = 4)
    private Short type;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "gmt_create")
    private Timestamp gmtCreate;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "gmt_modified")
    private Timestamp gmtModified;

    /**
     * 创建用户
     */
    @Column(name = "user_create")
    private Long userCreate;
}