package com.easypay.module.pay.service;

import com.easypay.common.model.Result;
import com.easypay.module.pay.entity.Order;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OrderService
 * @Description: 订单管理
 * @Author: lww
 * @Date: 6/29/23 8:37 AM
 * @Version: V1
 **/
@Service
public interface OrderService {

    Result list(Order order);

    Order updateStatus(String orderNo);

}
