package com.easypay.module.pay.service.impl;

import com.easypay.common.constant.SystemConstant;
import com.easypay.common.dynamicquery.DynamicQuery;
import com.easypay.common.model.PageBean;
import com.easypay.common.model.Result;
import com.easypay.module.pay.entity.Order;
import com.easypay.module.pay.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: 订单管理
 * @Author: lww
 * @Date: 6/29/23 8:40 AM
 * @Version: V1
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private DynamicQuery dynamicQuery;

    @Override
    public Result list(Order order) {
        String nativeSql = "SELECT COUNT(*) FROM app_order ";
        Long count = dynamicQuery.nativeQueryCount(nativeSql);
        PageBean<Order> data = new PageBean<>();
        if(count>0){
            nativeSql = "SELECT * FROM app_order ORDER BY gmt_create desc";
            Pageable pageable = PageRequest.of(order.getPageNo(),order.getPageSize());
            List<Order> list =  dynamicQuery.nativeQueryPagingList(Order.class,pageable,nativeSql);
            data = new PageBean(list,count);
        }
        return Result.ok(data);
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public Order updateStatus(String orderNo) {
        String nativeSql = "UPDATE app_order SET status=? WHERE order_no=?";
        dynamicQuery.nativeExecuteUpdate(nativeSql,
                new Object[]{SystemConstant.PAY_STATUS_YES,orderNo});
        nativeSql = "SELECT * FROM app_order WHERE order_no=?";
        return dynamicQuery.nativeQuerySingleResult(Order.class,nativeSql,new Object[]{orderNo});
    }
}