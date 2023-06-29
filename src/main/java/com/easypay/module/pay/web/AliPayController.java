package com.easypay.module.pay.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.module.pay.model.Product;
import com.easypay.module.pay.service.AliPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AliPayController
 * @Description: 个人支付宝支付
 * @Author: lww
 * @Date: 6/29/23 8:43 AM
 * @Version: V1
 **/
@RestController
@RequestMapping("/pay")
public class AliPayController extends AbstractController {

    @Autowired
    private AliPayService aliPayService;

    /**
     * 生成支付二维码
     * @return
     */
    @PostMapping(value="aliPay")
    public Result aliPay(Product product) {
        return aliPayService.aliPay(product);
    }

}