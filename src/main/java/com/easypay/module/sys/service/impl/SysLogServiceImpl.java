package com.easypay.module.sys.service.impl;

import com.easypay.common.dynamicquery.DynamicQuery;
import com.easypay.common.model.PageBean;
import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysLog;
import com.easypay.module.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: SysLogServiceImpl
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:54 PM
 * @Version: V1
 **/
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private DynamicQuery dynamicQuery;

    @Override
    public Result list(SysLog log) {
        String nativeSql = "SELECT COUNT(*) FROM sys_log ";
        Long count = dynamicQuery.nativeQueryCount(nativeSql);
        PageBean<SysLog> data = new PageBean<>();
        if(count>0){
            nativeSql = "SELECT * FROM sys_log ORDER BY gmt_create desc";
            Pageable pageable = PageRequest.of(log.getPageNo(),log.getPageSize());
            List<SysLog> list =  dynamicQuery.nativeQueryPagingList(SysLog.class,pageable,nativeSql);
            data = new PageBean(list,count);
        }
        return Result.ok(data);
    }
}