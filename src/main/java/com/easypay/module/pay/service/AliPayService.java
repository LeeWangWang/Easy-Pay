package com.easypay.module.pay.service;

import com.easypay.common.model.Result;
import com.easypay.module.pay.model.Product;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AliPayService
 * @Description: 支付宝支付
 * @Author: lww
 * @Date: 6/29/23 8:37 AM
 * @Version: V1
 **/
@Service
public interface AliPayService {

    Result aliPay(Product product);

}
