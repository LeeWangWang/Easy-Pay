package com.easypay.module.pay.service.impl;

import com.easypay.common.dynamicquery.DynamicQuery;
import com.easypay.common.model.Result;
import com.easypay.module.pay.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * @ClassName: StatisticServiceImpl
 * @Description: 统计管理
 * @Author: lww
 * @Date: 6/29/23 8:40 AM
 * @Version: V1
 **/
@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private DynamicQuery dynamicQuery;

    @Override
    public Result console() {
        HashMap<String,Object> map = new HashMap<>();
        String nativeSql = "SELECT COUNT(*) FROM sys_user";
        Long count = dynamicQuery.nativeQueryCount(nativeSql);
        map.put("userCount",count);
        nativeSql = "SELECT COUNT(*) FROM app_order";
        count = dynamicQuery.nativeQueryCount(nativeSql);
        map.put("orderCount",count);
        nativeSql = "SELECT SUM(total_Fee) FROM app_order";
        BigDecimal totalFee = (BigDecimal) dynamicQuery.querySingleResult(nativeSql);
        map.put("totalFee",totalFee.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        return Result.ok(map);
    }
}