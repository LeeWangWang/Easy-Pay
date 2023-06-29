package com.easypay.module.pay.service;

import com.easypay.common.model.Result;
import com.easypay.module.pay.model.Product;
import org.springframework.stereotype.Service;

/**
 * @ClassName: WxPayService
 * @Description: 微信支付
 * @Author: lww
 * @Date: 6/29/23 8:38 AM
 * @Version: V1
 **/
@Service
public interface WxPayService {

    Result wxPay(Product product);

    Result jsApiPay(Product product);

}
