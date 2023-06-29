package com.easypay.module.pay.service.impl;

import cn.hutool.core.util.IdUtil;
import com.easypay.common.constant.SystemConstant;
import com.easypay.common.dynamicquery.DynamicQuery;
import com.easypay.common.model.Result;
import com.easypay.common.util.DateUtils;
import com.easypay.common.util.ShiroUtils;
import com.easypay.module.pay.entity.Order;
import com.easypay.module.pay.model.Product;
import com.easypay.module.pay.service.WxPayService;
import com.easypay.module.pay.util.PayUtils;
import com.yungouos.pay.common.PayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @ClassName: WxPayServiceImpl
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 8:41 AM
 * @Version: V1
 **/
@Service
public class WxPayServiceImpl implements WxPayService {

    @Autowired
    private DynamicQuery dynamicQuery;
    @Autowired
    private PayUtils payUtils;

    @Override
    @Transactional(rollbackFor=Exception.class)
    public Result wxPay(Product product) {
        try {
            Long orderNo = IdUtil.getSnowflake(1, 1).nextId();
            product.setOutTradeNo(orderNo+"");
            String result = payUtils.wxPay(product);
            Order order = new Order();
            order.setProductId(product.getProductId());
            order.setTotalFee(new BigDecimal(product.getTotalFee()));
            order.setStatus(SystemConstant.PAY_STATUS_NO);
            order.setType(SystemConstant.PAY_TYPE_WX);
            order.setOrderNo(orderNo+"");
            order.setBody(product.getBody());
            order.setGmtCreate(DateUtils.getTimestamp());
            order.setGmtModified(order.getGmtCreate());
            order.setUserCreate(ShiroUtils.getUserId());
            dynamicQuery.save(order);
            return Result.ok(result);
        }catch (PayException e){
            return Result.error(e.getMessage());
        }
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public Result jsApiPay(Product product) {
        Long orderNo = IdUtil.getSnowflake(1, 1).nextId();
        product.setOutTradeNo(orderNo+"");
        String result = payUtils.jsApiPay(product);
        Order order = new Order();
        order.setProductId(product.getProductId());
        order.setTotalFee(new BigDecimal(product.getTotalFee()));
        order.setStatus(SystemConstant.PAY_STATUS_NO);
        order.setType(SystemConstant.PAY_TYPE_WXP);
        order.setOrderNo(orderNo+"");
        order.setBody(product.getBody());
        order.setGmtCreate(DateUtils.getTimestamp());
        order.setGmtModified(order.getGmtCreate());
        order.setUserCreate(-1L);//演示而已
        dynamicQuery.save(order);
        return Result.ok(result);
    }
}